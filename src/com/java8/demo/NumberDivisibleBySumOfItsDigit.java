package com.java8.demo;

public class NumberDivisibleBySumOfItsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1343;
		int sum1 = 0;
		int temp = num1;

		while (temp % 10 != 0) {
			sum1 += temp % 10;
			temp /= 10;
		}
		System.out.println(sum1);
		if (num1 % sum1 == 0) {
			System.out.println("Number is divisible by sum of its digits");
		} else {
			System.out.println("Number is not divisible by sum of its digits");
		}
	}

}
