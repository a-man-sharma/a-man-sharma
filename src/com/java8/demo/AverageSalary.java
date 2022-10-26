package com.java8.demo;

public class AverageSalary {

	public static double[] findDetails(double[] salary) {
		// Implement your code here and change the return value accordingly
		double sum = 0, less = 0, more = 0;
		double arr[] = new double[3];
		for (double i : salary) {
			sum += i;
		}
		arr[0] = sum / salary.length;

		for (double j : salary) {
			if (j > arr[0]) {
				more++;
			} else if (j < arr[0]) {
				less++;
			}
		}
		arr[1] = more;
		arr[2] = less;

		return arr;

	}

	public static void main(String[] args) {
		double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
		double[] details = findDetails(salary);

		System.out.println("Average salary: " + details[0]);
		System.out.println("Number of salaries greater than the average salary: " + details[1]);
		System.out.println("Number of salaries lesser than the average salary: " + details[2]);
	}

}
