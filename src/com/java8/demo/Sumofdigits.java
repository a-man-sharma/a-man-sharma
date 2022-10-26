package com.java8.demo;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int sumOfDigits = 0; int temp = 0; int inputNumber = 7865; while (inputNumber
		 * > 0) { temp = inputNumber % 10; sumOfDigits += temp; inputNumber =
		 * inputNumber / 10; }
		 * 
		 * System.out.println("Sum of digits are : " + sumOfDigits);
		 */

		int inputNumber = 9;
		int sumOfDigits = 0;
		int temp = 0;

		do {
			temp = inputNumber % 10;
			sumOfDigits += temp;
			inputNumber = inputNumber / 10;
		} while (inputNumber > 0);

		System.out.println("Sum of digits : " + sumOfDigits);
	}

}
