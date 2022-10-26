package com.java8.demo;

public class Calculator {
	int num1, num2, num3;

	public double findAverage(int a, int b, int c) {

		return Math.round(((a + b + c) / 3.0) * 100) / 100.0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		double result = cal.findAverage(12, 8, 15);
		System.out.println(result);
	}

}
