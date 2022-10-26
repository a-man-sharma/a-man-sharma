package com.java8.demo;

public class Regex {

	public static void main(String args[]) {
		/*
		 * String regex1 = "Welcome.*"; String str1 = "Welcome 453";
		 * 
		 * String regex2 = "Welcome to (India|Mysore)"; String str2 =
		 * "Welcome to Mysoe";
		 * 
		 * String regex3 = "[^Welcome]"; String str3 = "e";
		 * 
		 * System.out.println(str1.matches(regex1));
		 * System.out.println(str2.matches(regex2));
		 * System.out.println(str3.matches(regex3));
		 */
		String regex11 = "[\\w]+ [\\w]+ [\\d]+";
		String str11 = "Java Training 123";

		String regex22 = "[\\w]+ [\\t] [\\w]+";
		String str22 = "Java 	 Training";

		String regex33 = "[\\w]+ [^\\w]+ [\\d]+";
		String str33 = "Java Training 123";

		String regex4 = "[\\D]+ [\\W]+";
		String str4 = "Java *";

		System.out.println(str11.matches(regex11));
		System.out.println(str22.matches(regex22));
		System.out.println(str33.matches(regex33));
		System.out.println(str4.matches(regex4));
	}
}
