package com.java.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CourseIdComparator implements Comparator<Course2> {
	@Override
	public int compare(Course2 c1, Course2 c2) {
		return c1.courseId - c2.courseId;
	}
}

class Course2 {
	String courseName;
	int courseId;

	public Course2(int courseId, String courseName) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return courseName;
	}

}

class Course1 {
	public static void main(String[] args) {
		ArrayList<Course2> courseList = new ArrayList<>();
		courseList.add(new Course2(124, "AngularJS"));
		courseList.add(new Course2(120, "Java"));
		courseList.add(new Course2(121, "Hibernate"));

		Collections.sort(courseList, new CourseIdComparator());
		System.out.println(courseList);
	}

}
