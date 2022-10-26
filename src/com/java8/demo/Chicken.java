package com.java8.demo;

public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHeads = 150, totalLegs = 500;
		int chicken = 0, rabbit = 0;
		/*
		 * logic behind calculation: chicken and rabbit both have 1 head ; and chicken
		 * have 2 leg and rabbit have 4 leg; simple equation to calculate total head and
		 * leg is below totalhead = noofchicken + noofrabbit totalleg = 2*noofchicken +
		 * 4*noofrabbit after solving both equation noofrabbit=(totalleg-2*totalhead)/2
		 */
		rabbit = (totalLegs - totalHeads * 2) / 2;
		if (rabbit > 0 && rabbit % 2 == 0 && (totalHeads - rabbit) > 0) {
			System.out.println("Number of Rabbits: " + rabbit);
			System.out.println("Number of chickens " + (totalHeads - rabbit));
		} else {
			System.out.println("The number of chicken and rabbit can not be found");
		}
	}

}
