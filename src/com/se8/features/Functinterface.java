package com.se8.features;

@FunctionalInterface
interface Shape {
	void draw();

	// Double perimeter(); //Uncomment the abstract method to observe the difference

	public default Double area(Integer radius) {
		return radius * 3.14;
	}

	public default Double area(Double height, Double width) {
		return height * width;
	}

	public static void print() {
		System.out.println("Inside Shape");
	}
}

public class Functinterface {

	public static void main(String[] args) {
		Shape.print();
	}

}
