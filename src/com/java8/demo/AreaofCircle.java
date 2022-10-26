package com.java8.demo;

public class AreaofCircle {
	private static final float PI = 3.14f;
	private float radius;
	private float area;

	public AreaofCircle(float radius) {
		this.radius = radius;
		area = PI * radius * radius;

	}

	public float getRadius() {
		return this.radius;
	}

	public float getareaOfCircle() {
		return this.area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaofCircle circle = new AreaofCircle(3);
		float areaOfCircle = circle.getareaOfCircle();
		System.out.println(areaOfCircle);
	}

}
