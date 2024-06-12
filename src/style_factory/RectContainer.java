package style_factory;

import java.util.ArrayList;
import java.util.List;

import composite.Node;
import composite.RectNode;

public class RectContainer extends Container{
	
	@Override
	public void addNode(String key, String icon, int level, boolean isLeaf) {
		RectNode newTop=new RectNode(key, icon, level, isLeaf);
		stack.add(newTop);
		
	}

	public void show() {
		level0.get(0).setUpper(true);
		level0.get(level0.size()-1).setLower(true);
		for(Node i : level0) {
			i.draw();
		}
	};

}
