package com.java8.demo;

public class AddressDetails {
	private String doorNo, street, city;
	private int pinCode;

	AddressDetails(String a, String b, String c, int d) {
		doorNo = a;
		street = b;
		city = c;
		pinCode = d;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressDetails add = new AddressDetails("D089", "St. Louis Street", "Springfield", 62729);
		System.out.println("Door No: " + add.getDoorNo());
		System.out.println("Street: " + add.getStreet());
		System.out.println("City: " + add.getCity());
		System.out.println("ZIP Code: " + add.getPinCode());
	}

}
