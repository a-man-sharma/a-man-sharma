package com.java.features;

class Course3 {
	String courseName;
	int numOfSeats;

	public Course3(String courseName, int numOfSeats) {
		this.courseName = courseName;
		this.numOfSeats = numOfSeats;
	}

	public void registerForCourse(int rollNo) {
		try {
			if (this.numOfSeats - 1 < 0) {
				throw new Exception("No more seats available for this course");
			}
			System.out.println("Booking successful!");
			this.numOfSeats -= 1;
			System.out.println("Available seats: " + this.numOfSeats);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

class RegisterThread extends Thread {
	Course3 c;

	RegisterThread(Course3 c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.registerForCourse(1);
	}
}

public class Syncronizationproblem {

	public static void main(String[] args) {
		Course3 cse = new Course3("CSE", 1);
		RegisterThread regObj1 = new RegisterThread(cse);
		regObj1.start();
		RegisterThread regObj2 = new RegisterThread(cse);
		regObj2.start();
	}
}
