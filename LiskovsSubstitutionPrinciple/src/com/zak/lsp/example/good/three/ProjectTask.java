package com.zak.lsp.example.good.three;

import com.zak.lsp.example.bad.three.Status;

//This task cannot be closed once started
public class ProjectTask extends Task{
	
	public boolean canClose(){
		return super.isStatus()!=Status.STARTED;
	}
	
	public void start(){
		super.start();
	}
	
	public void close() throws Exception{
		if(super.isStatus()==Status.STARTED)
			throw new Exception("Cannot close this task");
	}

}
