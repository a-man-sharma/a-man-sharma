package com.java8.demo;

public class StringManipulation {

	public static String moveSpecialCharacters(String str) {
		// Implement your code here and change the return value accordingly
		String s = "", s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))

				s += str.charAt(i);
			else
				s1 += str.charAt(i);
		}

		return s + s1;
	}

	public static void main(String args[]) {
		String str = "He@#$llo!*&";
		System.out.println(moveSpecialCharacters(str));
	}

}
