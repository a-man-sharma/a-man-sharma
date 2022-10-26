package com.java8.demo;

class FindNumber {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int sum = 0;

		// Implement your code here

		if ((num1 < num2) && (num1 / 10 != 0 && num1 / 100 == 0)) {
			aa: for (int index = 0; index < numbers.length; index++) {
				bb: for (int num = num1; num <= num2; num++) {
					sum = num / 10 + num % 10;
					if (sum % 3 == 0 && num % 5 == 0 && sum != 0) {
						numbers[index] = num;
						num1 = num + 1;
						break bb;
					}
				}
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = -90;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
