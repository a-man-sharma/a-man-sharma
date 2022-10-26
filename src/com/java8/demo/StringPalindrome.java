package com.java8.demo;

public class StringPalindrome {

	public static boolean checkPalindrome(String str) {
		// Implement your code here and change the return value accordingly
		boolean b = false;
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			s += str.charAt(str.length() - 1 - i);

		}
		if (s.equals(str))
			b = true;

		return b;
	}

	public static void main(String args[]) {
		String str = "radar";
		if (checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
