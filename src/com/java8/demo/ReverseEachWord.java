package com.java8.demo;

class ReverseEachWord {

	public static String reverseEachWord(String str) {
		// Implement your code here and change the return value accordingly

		str = str.trim();
		String[] a = str.split(" ");

		for (int i = 0; i < a.length; i++) {
			String s = "";
			for (int j = 0; j < a[i].length(); j++) {
				s += a[i].charAt(a[i].length() - 1 - j);
			}
			a[i] = s;
		}
		String result = "";
		for (int k = 0; k < a.length; k++) {
			if (k < a.length - 1)
				result += a[k] + " ";
			else
				result += a[k];
		}
		return result;
	}

	public static void main(String args[]) {
		String str = "all cows eat grass";
		System.out.println(reverseEachWord(str));
	}
}
