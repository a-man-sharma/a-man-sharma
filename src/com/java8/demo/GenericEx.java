package com.java8.demo;

class Container<Tom> {

	private Tom t;

	public void set(Tom t) {
		this.t = t;
	}

	public Tom get() {
		return t;
	}
}

public class GenericEx {

	public static void main(String[] args) {

		Container<Integer> integerContainer = new Container<>();
		integerContainer.set(1);
		// integerContainer.set("Jeo"); //Uncomment the code and check if String can be
		// passed to the set() method
		System.out.println("Inside Integer Container : " + integerContainer.get());

		Container<String> stringContainer = new Container<>();
		// stringContainer.set(1); //Uncomment the code and check if Integer can be
		// passed to the set() method
		stringContainer.set("Jeo");
		System.out.println("Inside String Container : " + stringContainer.get());

	}

}
