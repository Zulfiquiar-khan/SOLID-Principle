package com.zak.lsp.example.good.three;

public class ClientCode {
	public static void main(String args[]) throws Exception{
		//gets the task from some factory .. 
		//lets say it may get either task or project task object but you dont know
		
		Task t=null;
		t.start();
		if(t.canClose())
			t.close();
	}
}
