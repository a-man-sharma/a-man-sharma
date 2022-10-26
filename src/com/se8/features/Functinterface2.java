package com.se8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employ {
	private Integer empId;
	private String name;
	private Double sal;

	public Employ(Integer empId, String name, Double sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String empName) {
		this.name = name;
	}

	public static List<Employ> getEmpList() {
		Employ e1 = new Employ(101, "Aron", 50000D);
		Employ e2 = new Employ(102, "Cindia", 30000D);
		Employ e3 = new Employ(103, "Zidane", 45000D);
		List<Employ> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		return empList;
	}

}

public class Functinterface2 {
	// main method
	public static void main(String pars[]) {
		List<Employ> lstEmp = Employ.getEmpList();
		for (Employ e : lstEmp) {
			double sal = computeSalary(e, e1 -> e1.getSal() * 1.1); // 10% salary increment
			System.out.println(e.getName() + ": old salary: " + e.getSal() + ", new salary: " + sal);
		}
	}

	public static double computeSalary(Employ e, Function<Employ, Double> fn) {
		return fn.apply(e);
	}
}
