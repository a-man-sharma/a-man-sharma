package com.java8.demo;

class MyGen {
	public <T> void displayDetails(T[] array) {
		for (T i : array) {
			System.out.print(i + "\t");
		}
	}
}

public class GenericMethods1 {
	/*
	 * public static void main(String[] args) { String[] empNameList = { "Jack",
	 * "Eric" }; Integer[] empIdList = { 1001, 1002 };
	 * 
	 * MyGen details = new MyGen();
	 * 
	 * details.displayDetails(empIdList); details.displayDetails(empNameList); }
	 */
	public <E> void printArray(E[] a) {
		for (E i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
		Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
		Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
		GenericMethods1 tg = new GenericMethods1();
		tg.printArray(arrInteger);
		tg.printArray(arrChar);
		tg.printArray(arrDouble);

	}

}
