package com.zak.lsp.example.good.one;

public class StaticFactory {
	public static IArea getAreaShape() {
		Square s=new Square();
		s.setSide(10);
		return s;
	}
}

