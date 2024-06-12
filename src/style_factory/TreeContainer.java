package style_factory;

import composite.Node;
import composite.TreeNode;

public class TreeContainer extends Container{

	@Override
	public void addNode(String key, String icon, int level,boolean isLeaf) {
		TreeNode newTop=new TreeNode(key, icon, level, isLeaf);
		stack.add(newTop);
	}
	
	public void show() {
		level0.get(level0.size()-1).setLower(true);
		for(Node i : level0) {
			i.draw();
		}
	};
}
