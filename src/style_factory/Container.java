package style_factory;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import com.fasterxml.jackson.databind.*;
import composite.*;
public abstract class Container {
	protected List<Node> level0=new ArrayList<>();
	Stack<Node> stack=new Stack<>();

	public abstract void addNode(String key,String icon,int level,boolean isLeaf);
	
	public void popNode() {
//		System.out.println("stackpop:"+stack.peek().getname()+stack.peek().getname()+" "+stack.peek().getLevel());
		stack.pop();
	}
	
	public void topAdd() {
		Node top=stack.peek();
//		System.out.println("stackpop:"+stack.peek().getname()+" "+stack.peek().getLevel());
		stack.pop();
		stack.peek().add(top);
	}
	
	public int getTopLevel() {
		return stack.peek().getLevel();
	}
	
	public void addList() {
		level0.add(stack.peek());
	}
	
	public void show() {
		for(Node i : level0) {
			i.draw();
		}
	};
	
	public void printLen() {
		System.out.println("len:"+level0.size());
	}
	
	public boolean isStackEmpty() {
		return stack.isEmpty();
	}
	
	public void setLast() {
		stack.peek().setKidsLast(true);
	}
	
	public void setLevelLast() {
		level0.get(level0.size()-1). setLast(true);
	}
}
