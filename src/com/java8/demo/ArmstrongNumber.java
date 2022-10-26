package com.java8.demo;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1634;
		int power = 0;
		int temp = number;
		while (temp % 10 != 0) {
			temp /= 10;
			++power;
		}
		int temp2 = number;

		int sum = 0;
		for (int i = 1; i <= power; ++i) {
			sum += (int) Math.pow(temp2 % 10, power);
			temp2 /= 10;

			// System.out.println(sum);
		}
		if (number == sum) {
			System.out.println("Armstrong Number");

		} else {
			System.out.println("not an Armstrong number");
		}

	}

}
