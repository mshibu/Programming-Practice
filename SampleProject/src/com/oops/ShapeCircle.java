package com.oops;

public class ShapeCircle extends Shape implements ShapeConstants{
	int radius;
	
	public ShapeCircle(int rad){
		super();
		this.noOfSides = 0;
		this.radius = rad;
	}
	
	public double calculateArea() {
		this.area = this.PI * radius * radius;
		return area;
	}

	public double calculatePerimeter() {
		this.perimeter = 0;
		return perimeter;
	}

	public void setSides() {
		System.out.println("A circle has no sides!");
	}
}
