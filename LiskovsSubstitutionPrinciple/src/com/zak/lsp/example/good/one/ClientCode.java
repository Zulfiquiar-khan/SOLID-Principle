package com.zak.lsp.example.good.one;

public class ClientCode {
	
	public static void main(String args[]) {
		IArea r=StaticFactory.getAreaShape();		
		System.out.println("Area : "+r.getArea());
	}

}
