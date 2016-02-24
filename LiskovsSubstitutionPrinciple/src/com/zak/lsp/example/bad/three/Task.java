package com.zak.lsp.example.bad.three;

//This task can be closed
public class Task {
	
	private Status status;

	public Status isStatus() {
		return status;
	}

	public void start(){
		if(this.status==Status.CLOSE)
			this.status=Status.STARTED;
	}
	
	public void close() throws Exception{
		this.status=Status.CLOSE;
	}
	
}
