package com.java8.demo;

class LeapYear {

	public static int[] findLeapYears(int year) {
		// Implement your code here and change the return value accordingly

		int[] y = new int[15];
		do {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				break;
			} else {
				year++;
			}
		} while (year < year + 5);
		for (int i = 0; i < 15; i++) {
			y[i] = year;
			year += 4;
		}
		return y;
	}

	public static void main(String[] args) {
		
		
		int[] leapYears = findLeapYears(2000);
		for (int index = 0; index < leapYears.length; index++) {
			System.out.println(leapYears[index]);
		}
	}
}
