package com.zak.lsp.example.bad.one;

public class StaticFactory {
	public static Rectangle getRectangle() {
		return new Square();
	}
}
