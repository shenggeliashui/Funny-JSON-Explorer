package composite;

public class RectNode extends Node{
	
	public RectNode(String name, String icon, int level, boolean islast) {
		super(name, icon, level, islast);
		// TODO 自动生成的构造函数存根
	}
	
	public void draw() {
		StringBuilder output=new StringBuilder();
		if(this.level!=0) {
			output.append("│ ");
			for(int i=0;i<this.level;i++) {
				output.append("  ");
			}
		}
		if(this.upper) {
			output.append("┌─");
		
		}else if(this.islast && (this.kids.size()==0 || this.level!=0)) {
			output.append("└─ ");
		}else{
			output.append("├─ ");
		}
		output.append(this.icon+" "+this.name);
		
		while(output.length()<60) {
			if(output.length()==59) {
				if(this.upper) {
					output.append("—─┐");
				}else {
					output.append("—─┤");
				}
				
			}
			else{
				output.append("——");
			}
		}
		
		if(this.lower) {
			if(kids.size()==0) {
				output.replace(0,4, "└─——");
				output.replace(60, 61,"—┘");
			}else {
				kids.get(kids.size()-1).setLower(true);
			}
		}
		System.out.println(output);
		for(Node kid :kids) {
			kid.draw();
		}
	}
}
