package com.java8.demo;

public class StaticTryout {
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		System.out.println("Number of cars created: " + Car.getNumberOfCars());
	}

	static {
		System.out.println("Tester class loaded");
	}
}

class Car {
	private static String color;
	private static int numberOfCars = 0;

	static {
		System.out.println("Car class loaded");
	}

	public Car(String color) {
		this.color = color;
		numberOfCars++;
	}

	public static String getColor() {
		return color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
}
