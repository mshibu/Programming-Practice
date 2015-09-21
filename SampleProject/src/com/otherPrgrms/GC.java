package com.otherPrgrms;

public class GC {
	
	private String color;
	 
	public GC(String color) {
		this.color = color;
	}
 
	@Override
	public void finalize() {
		System.out.println(this.color + " cleaned");
	}

}
