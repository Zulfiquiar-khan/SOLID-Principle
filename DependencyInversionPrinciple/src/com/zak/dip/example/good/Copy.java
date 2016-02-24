package com.zak.dip.example.good;

public class Copy {
	
	public void copy(IReader reader,IWriter writer){
		String data=reader.read();
		writer.write(data);
	}
}
