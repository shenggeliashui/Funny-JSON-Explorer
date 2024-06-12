package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
	protected String name;
	protected String icon;
	protected int level;
	protected boolean islast;
	protected boolean upper;
	protected boolean lower;
	protected List<Node> kids=new ArrayList<>();
	
	public Node(String name, String icon, int level, boolean islast) {
        this.name = name;
        this.icon = icon;
        this.level = level;
        this.islast=islast;
        this.upper=false;
        this.lower=false;
        
    }
	
	public void setUpper(boolean upper) {
		this.upper=upper;
	}
	
	public void setLower(boolean lower) {
		this.lower=lower;
	}
	
	public void setKidsLast(boolean last) {
		kids.get(kids.size()-1).islast=last;
	}
	
	public void setLast(boolean last) {
		this.islast=last;
	}
	
	public abstract void draw();
	
	public int getLevel() {
		return level;
	}
	
	public String getname() {
		return name;
	}
	
	public void add(Node a) {
		kids.add(a);
	}
}
