package design_pattern;

public class FunnyJsonExplorer {
	private FactoryProducer fp;
	
	public FunnyJsonExplorer(String filePath, String style, String iconFamily) {
		load(filePath, style,iconFamily);
		show();
	}
	
	public void load(String filePath, String style, String iconFamily) {
		fp = new FactoryProducer(filePath, style, iconFamily);
		
	}
	
	public void show() {
		fp.show();
	}
}
