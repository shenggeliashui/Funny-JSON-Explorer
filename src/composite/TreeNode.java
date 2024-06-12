package composite;

public class TreeNode extends Node{

	public TreeNode(String name, String icon, int level,boolean islast) {
		super(name, icon, level,islast);
		// TODO 自动生成的构造函数存根
	}
		
	public void draw() {
		if(this.level!=0) {
			if(this.lower) {
				System.out.print("  ");
			}else {
				System.out.print("│ ");
			}
			for(int i=0;i<this.level;i++) {
				System.out.print("  ");
			}
		}
		if(this.islast) {
			System.out.print("└─");
		}else{
			System.out.print("├─");
		}
		
		System.out.println(this.icon+" "+this.name);
		for(Node kid :kids) {
			if(this.lower) {
				kid.setLower(true);
			}
			kid.draw();
		}
	}
}
