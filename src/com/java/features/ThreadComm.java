package com.java.features;

class Course5 {
	String courseName;
	int numOfSeats;

	public Course5(String courseName, int numOfSeats) {
		this.courseName = courseName;
		this.numOfSeats = numOfSeats;
	}

	public synchronized void registerForCourse(int rollNo) {
		try {
			if (this.numOfSeats - 1 < 0) {
				this.wait(5000); // This releases the lock on the object and waits for 5 seconds
				if (this.numOfSeats - 1 < 0) // Check if any seat got released by the Cancellation
					throw new Exception("No more seats available for this course");
			}
			System.out.println("Booking successful!");
			this.numOfSeats -= 1;
			System.out.println("Available seats: " + this.numOfSeats);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public synchronized void cancelSeats() {
		try {
			this.numOfSeats += 1;
			System.out.println("Cancellation successful!");
			System.out.println("Available seats: " + this.numOfSeats);
			this.notify(); // Notifies one of the waiting threads to resume
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

class RegisterThread2 extends Thread {
	Course5 c;

	RegisterThread2(Course5 c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.registerForCourse(1);
	}
}

class CancelRegistration extends Thread {
	Course5 c;

	CancelRegistration(Course5 c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.cancelSeats();
	}
}

public class ThreadComm {
	public static void main(String[] args) throws InterruptedException {
		Course5 cse = new Course5("CSE", 1);
		RegisterThread2 regObj1 = new RegisterThread2(cse);
		regObj1.start();
		RegisterThread2 regObj2 = new RegisterThread2(cse);
		regObj2.start();

		Thread.sleep(2000);
		// Running a cancellation thread after 2 seconds
		CancelRegistration cancelObj1 = new CancelRegistration(cse);
		cancelObj1.start();
	}
}
