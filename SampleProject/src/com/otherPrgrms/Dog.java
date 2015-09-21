package com.otherPrgrms;

public class Dog extends Animal{
	private int numberOfLegs;
	private boolean hasOwner;
	
	public Dog(){
		numberOfLegs = 4;
		hasOwner  = false;
	}

	public void makeDogBark(){
		Dog d = new Dog();
		d.bark();
	}
	
	public void makeDogEat(){
		Dog d = new Dog();
		d.eat();
	}
	
	private void bark(){
		System.out.println("Woof!");
	}
	
	public void move(){
		System.out.println("Running!");
	}
}
