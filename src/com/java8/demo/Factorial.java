package com.java8.demo;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7;
		int count = num;
		if (num <= 0) {
			System.out.println(1);

		} else {
			while (count != 1) {
				num *= (--count);
			}
			System.out.println(num);
			System.out.println('\u0000');
		}

	}

}
