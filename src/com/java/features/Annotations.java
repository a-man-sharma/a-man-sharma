package com.java.features;

class Professor {
	String name;
	float basic;

	double calculateSalary(float basic, float DA, float HRA, float income_tax) {
		return basic + DA + HRA - income_tax;
	}
}

class AssistantProfessor extends Professor {
	@Override
	double calculateSalary(float basnnoic, float DA, float HRA, float income_tax) {
		return (basic * 0.7) + DA + HRA - income_tax;
	}
}

public class Annotations {

	public static void main(String[] args) {
		AssistantProfessor assistanceprofessor = new AssistantProfessor();
		double salary = assistanceprofessor.calculateSalary(4000, 2000, 1000, 500);
		System.out.println(salary);
	}
}
