package com.java8.demo;

public class Teacher {
	private String teacherName;
	private String subject;
	private double salary;

	public Teacher(String teacherName, String subject, double salary) {

		this.salary = salary;
		this.subject = subject;
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher[] teacher = new Teacher[4];
		Teacher t1 = new Teacher("Alex", "Java Fundamental", 1200L);
		Teacher t2 = new Teacher("John", "RDBMS", 800L);
		Teacher t3 = new Teacher("Sam", "Networking", 900L);
		Teacher t4 = new Teacher("Maria", "Python", 900L);
		teacher[0] = t1;
		teacher[1] = t2;
		teacher[2] = t3;
		teacher[3] = t4;
		for (Teacher i : teacher) {
			System.out.print("Name :" + i.teacherName + ", ");
			System.out.print("Subject :" + i.subject + ", ");
			System.out.println("Salary :" + i.salary);
		}

	}

}
