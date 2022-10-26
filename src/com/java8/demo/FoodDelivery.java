package com.java8.demo;

public class FoodDelivery {

	private char foodType;
	private int quantity;
	private int distance;

	FoodDelivery(char foodType, int quantity, int distance) {
		this.distance = distance;
		this.foodType = foodType;
		this.quantity = quantity;

	}

	public int calculate() {
		int costPerPlate;
		int totalCost;
		int deliveryCharges;
		if ((foodType == 'V' || foodType == 'N') && distance > 0 && quantity >= 1) {
			switch (foodType) {
			case 'V':
				costPerPlate = 12;
				if (distance <= 3) {
					deliveryCharges = 0;
				} else if (distance > 3 && distance <= 6) {
					deliveryCharges = (distance - 3) * 1;
				} else {
					deliveryCharges = (distance - 6) * 2 + 3;
				}
				totalCost = this.quantity * costPerPlate + deliveryCharges;
				return totalCost;
			case 'N':
				costPerPlate = 15;
				if (distance <= 3) {
					deliveryCharges = 0;
				} else if (distance > 3 && distance <= 6) {
					deliveryCharges = (distance - 3) * 1;
				} else {
					deliveryCharges = (distance - 6) * 2 + 3;
				}
				totalCost = this.quantity * costPerPlate + deliveryCharges;
				return totalCost;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodDelivery fd = new FoodDelivery('N', 6, 1);
		System.out.println(fd.calculate());
	}

}
