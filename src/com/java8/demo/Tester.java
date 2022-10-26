package com.java8.demo;

/*
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * int a = 2, b = 2, c = 7; if (a == 7 || b == 7 || c == 7) { if (a == 7) {
 * System.out.println(b * c); } else if (b == 7) { System.out.println(c); } else
 * { System.out.println(-1); } } else { System.out.println(a * b * c);
 * 
 * } }
 */
class Bike {
	int speedlimit = 90;
}

class Honda extends Bike {
	int speedlimit = 150;
}

public class Tester {
	public static void main(String args[]) {
		Bike bike = new Bike();
		Honda honda = new Honda();
		Bike hondaBike = new Honda();

		System.out.print(bike.speedlimit + " ");
		System.out.print(honda.speedlimit + " ");
		System.out.print(hondaBike.speedlimit); // Line15
	}
}
