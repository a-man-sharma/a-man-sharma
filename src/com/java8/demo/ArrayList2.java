package com.java8.demo;

import java.util.ArrayList;
import java.util.List;

class Student1 {
	private int studentId;
	private String studentName;
	private boolean courseRegistered;

	public Student1(int studentId, String studentName, boolean courseRegistered) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean getCourseRegistered() {
		return courseRegistered;
	}

	public void setCourseRegistered(boolean courseRegistered) {
		this.courseRegistered = courseRegistered;
	}

}

class ArrayList2 {
	public static void main(String[] args) {
		List<Student1> students = new ArrayList<>();
		students.add(new Student1(1001, "Steve", true));
		students.add(new Student1(1002, "Rachel", false));
		students.add(new Student1(1003, "Monica", true));
		students.add(new Student1(1004, "David", true));

		List<String> studentNames = new ArrayList<>();
		for (Student1 student : students) {
			studentNames.add(student.getStudentName());
			System.out.println("Student Id: " + student.getStudentId());
			System.out.println("Student Name: " + student.getStudentName());
			System.out.println("Course Registered: " + student.getCourseRegistered());
		}
		System.out.println("===========================================");
		System.out.println("Student Names: " + studentNames);

	}

}
