package design_pattern;
import icons_family.*;
import style_factory.*;
public class Main1 {
	public static void main(String[] args) {
		String text = "Hello, World!\nThis is a heart symbol: ♤\u2740\n";
        System.out.println(text);
		TreeStyleFactory tree=new TreeStyleFactory();
		tree.createContainer("JSON/fruits.json", new PokerIcons ());
		tree.showContrainer();
		RectStyleFactory rect=new RectStyleFactory();
		rect.createContainer("JSON/fruits.json", new FlowerIcons ());
		rect.showContrainer();
		System.out.println("end");
	}
}
