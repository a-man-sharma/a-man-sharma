package com.se8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employe {
	private Integer empId;
	private String empName;
	private String country;

	public Employe(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", country=" + country + "]";
	}
}

public class PredicateInterface {
	// main method
	public static void main(String[] args) {
		// Creating 5 instances of Employee
		Employe e1 = new Employe(1001, "Aron", "Spain");
		Employe e2 = new Employe(1050, "Cindia", "Portugal");
		Employe e3 = new Employe(1602, "Zidane", "France");
		Employe e4 = new Employe(1453, "Robert", "Belgium");
		Employe e5 = new Employe(1500, "Francis", "USA");

		// lstEmpIds is the populated list of employee ids
		List<Integer> lstEmpIds = new ArrayList<>();
		lstEmpIds.add(e1.getEmpId());
		lstEmpIds.add(e2.getEmpId());
		lstEmpIds.add(e3.getEmpId());
		lstEmpIds.add(e4.getEmpId());
		lstEmpIds.add(e5.getEmpId());

		System.out.println("Printing Even Employee Ids");
		evaluate(lstEmpIds, (n) -> n % 2 == 0);
		System.out.println("Printing Odd Employee Ids");
		evaluate(lstEmpIds, (n) -> n % 2 == 1);
		System.out.println("Printing Employee Ids less than 1500");
		evaluate(lstEmpIds, (n) -> n < 1500);
	}

	public static void evaluate(List<Integer> listEmpId, Predicate<Integer> predicateArg) {
		for (int empId : listEmpId) {
			if (predicateArg.test(empId))
				System.out.println(empId);
		}
	}
}
