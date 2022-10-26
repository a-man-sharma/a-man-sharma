package com.java8.demo;

/*
 * public static String removeWhiteSpaces(String str) { // Implement your code
 * here and change the return value accordingly
 * 
 * return str.replace(" ", "");
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * String str = "   Hello   How are you   ";
 * 
 * System.out.println(str);
 * 
 * }
 */
class Cabin {
	public int cabinNumber;

	Cabin(int number) {
		this.cabinNumber = number;
	}
}

public class Tryout {
	public String name;
	public Cabin cabin;

	public Tryout(String name, Cabin c) {
		this.name = name;
		this.cabin = c;
	}

	public void updateCabin(Cabin c) {
		this.cabin.cabinNumber = c.cabinNumber;
	}

	public static void main(String args[]) {
		Cabin c1 = new Cabin(121);
		Tryout p1 = new Tryout("Ronald", c1);
		Tryout p2 = new Tryout("Bonnie", c1);
		Cabin c2 = new Cabin(122);
		p2.updateCabin(c2);
		System.out.println(p1.cabin.cabinNumber);
		System.out.println(p2.cabin.cabinNumber);
	}

}
