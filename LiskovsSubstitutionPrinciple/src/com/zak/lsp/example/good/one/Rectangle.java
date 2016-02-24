package com.zak.lsp.example.good.one;

public class Rectangle implements IArea {
	
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public double getArea(){
		return this.height*this.width;
	}
}