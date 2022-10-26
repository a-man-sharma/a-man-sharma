package com.java8.demo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1234564321l;
		long newnum = 0l;
		while (num % 10 != 0) {

			newnum = 10 * newnum + num % 10;
			num /= 10;
		}
		if (num == newnum)
			System.out.println("It is Palindrome");
		else {
			System.out.println("It is not Palindrome");
		}
	}
}
