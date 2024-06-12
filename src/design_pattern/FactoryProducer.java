package design_pattern;

import icons_family.*;
import style_factory.*;

public class FactoryProducer {
	private AbsFactory factory;
	private Icons icons;
	
	public FactoryProducer(String filePath,String style,String iconFamily) {
		// TODO 自动生成的构造函数存根
		switch (iconFamily){
		case "Poker_Faces": {
			icons=new PokerIcons();
			break;
		}
		case "Flowers": {
			icons=new FlowerIcons();
			break;
		}
		default:
			System.out.println("Error paramers!");
		}
		
		switch(style) {
		case "Tree":{
			factory=new TreeStyleFactory();
			break;
		}
		case "Rectangle":{
			factory=new RectStyleFactory();
			break;
		}
		}
		factory.createContainer(filePath, icons);
	}
	
	
	public void show() {
		factory.showContrainer();
	}
}
