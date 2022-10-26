package com.java8.demo;

public class NestedloopPattern {

	public static void main(String[] args) {
		int rows = 10;
//Logic1
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= i; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line

				/*
				 * if (j < i) { System.out.print("  "); continue; }
				 */
				System.out.print(j + " ");

			}
			System.out.println(""); // println displays the text along with a new line
		}
//Logic2		
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= rows; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line

				if (j <= 10 - i) {
					System.out.print("  ");
					continue;
				}

				System.out.print(j + " ");

			}
			System.out.println(""); // println displays the text along with a new line
		}
//Logic3
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= rows; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line

				if (j < i) {
					System.out.print("  ");
					continue;
				}

				System.out.print(j + " ");

			}
			System.out.println(""); // println displays the text along with a new line
		}
//Logic4		
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= 11 - i; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line

				System.out.print(j + " ");

			}

			System.out.println(""); // println displays the text along with a new line
		}

//Logic5		
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= i; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				if (i <= 10 - j) {
					if (i <= 5)
						continue;
					System.out.print("  ");
					continue;
				}

				System.out.print(j + " ");

			}
			if (i > 5)
				System.out.println(""); // println displays the text along with a new line
		}

//Logic6		
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= i; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				if (j > 11 - i) {
					continue;
				}

				System.out.print(j + " ");

			}
			System.out.println(""); // println displays the text along with a new line
		}
//Logic 7
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= 11 - i; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line
				if (j < i) {
					System.out.print("  ");
					continue;
				}
				System.out.print(j + " ");
			}
			if (i < 5)
				System.out.println(""); // println displays the text along with a new line
		}
//Logic 8
		for (int i = 1; i <= rows; ++i) {// it will run 10 times
			for (int j = 1; j <= rows; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				// print displays the text without adding a new line

				if ((j < i) || (j <= 11 - i)) {
					System.out.print("  ");
					continue;
				}

				System.out.print(j + " ");

			}
			System.out.println(""); // println displays the text along with a new line
		}
//Logic9		
		for (int i = 1; i <= 10; ++i) {// it will run 10 times
			for (int j = 1; j <= 10; ++j) {// it will run 1+2+3+4+5+6+7+8+9+10=55 times
				if ((i < 6) && (j <= i + 4)) {

					if (j <= 5 - i) {
						System.out.print("  ");
						continue;
					}
					System.out.print(j + " ");

				} else if (i >= 6 && j > i - 5) {
					if (j < 15 - i)
						System.out.print(j + " ");

				} else
					System.out.print("  ");
			}

			/*
			 * System.out.print("  ");
			 */
			System.out.println(""); // println displays the text along with a new line
		}
//Logic 10

		// Declaring and initializing variables

		// Variable initialized to the row where max star
		// should be there as after that they decreases to
		// give diamond pattern
		int number = 7;

		int i, j;

		// Outer loop 1
		// prints the first half diamond
		for (i = 1; i <= number; i++) {

			// Inner loop 1 print whitespaces inbetween
			for (j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}

			// Inner loop 2 prints star
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}

		// Outer loop 2
		// Prints the second half diamond
		for (i = number - 1; i > 0; i--) {

			// Inner loop 1 print whitespaces inbetween
			for (j = 1; j <= number - i; j++) {
				System.out.print(" ");
			}

			// Inner loop 2 print star
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}

	}
}
