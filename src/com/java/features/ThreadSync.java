package com.java.features;

class Course4 {
	String courseName;
	int numOfSeats;

	public Course4(String courseName, int numOfSeats) {
		this.courseName = courseName;
		this.numOfSeats = numOfSeats;
	}

	public synchronized void registerForCourse(int rollNo) {
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

class RegisterThread1 extends Thread {
	Course4 c;

	RegisterThread1(Course4 c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.registerForCourse(1);
	}
}

public class ThreadSync {
	public static void main(String[] args) {
		Course4 cse = new Course4("CSE", 1);
		RegisterThread1 regObj1 = new RegisterThread1(cse);
		regObj1.start();
		RegisterThread1 regObj2 = new RegisterThread1(cse);
		regObj2.start();
	}

}
