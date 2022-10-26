package com.java8.demo;

class SwiftFood {
	private int orderId;
	private String orderedFoods;
	private double totalPrice;
	private String status;

	public double calculateTotalPrice(int unitPrice) {

		totalPrice = unitPrice + (unitPrice * 5) / 100.0;
		System.out.println("Total Price :" + totalPrice);
		return totalPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int oid) {
		this.orderId = oid;
	}

	public String getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(String ofood) {
		this.orderedFoods = ofood;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void main(String[] args) {
		SwiftFood sf = new SwiftFood();
		sf.setOrderId(101);
		sf.setOrderedFoods("Spinach Alfredo Pasta");
		sf.setStatus("Ordered");
		System.out.println("Order Details");
		System.out.println("Order Id :" + sf.getOrderId());
		System.out.println("Ordered Food :" + sf.getOrderedFoods());
		System.out.println("Order Status :" + sf.getStatus());
		sf.calculateTotalPrice(120);
	}
}