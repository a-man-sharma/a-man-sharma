package com.se8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Emp {
	private Integer id;
	private String name;
	private String role;
	private Double sal;

	public Emp(Integer id, String name, String role, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = name;
	}

	public static List<Emp> getEmpList() {
		Emp e1 = new Emp(101, "Aron", "Sr System Engineer", 25000D);
		Emp e2 = new Emp(102, "Cindia", "System Engineer", 20000D);
		Emp e3 = new Emp(103, "Zidane", "Technology Lead", 35000D);
		Emp e4 = new Emp(104, "Emilia", "Technology Architect", 40000D);
		List<Emp> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		return empList;
	}
}

public class ConsumerInterface {
	public static void main(String[] args) {
		List<Emp> lstEmp = Emp.getEmpList();

		System.out.println("***** Generating HR Report *****");
		generateReport(lstEmp,
				e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole() + " : " + e.getSal()));

		System.out.println("\n***** Generating Manager Report *****");
		generateReport(lstEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole()));
	}

	public static void generateReport(List<Emp> lstEmp, Consumer<Emp> consumer) {
		for (Emp e : lstEmp) {
			consumer.accept(e);
		}
	}
}
