package com.otherPrgrms;

public abstract class Animal {
	
	public boolean isAPet = true;
	public String owner = "Fred";
	
	public void sleep(){
		System.out.println("Sleeping!");
	}
	
	protected void eat(){
		System.out.println("Eating!");
	}
	
	public abstract void move();

}
