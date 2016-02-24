package com.zak.lsp.example.good.two;

public class Graph3D extends Graph2D{
	
	private Graph2D g=new Graph2D();
	
	public void draw(int x,int y,int z){
		g.draw(x, y);
		System.out.println("Drawing 3D graph at "+x+","+y+","+z);
	}
	
}
