package javatutorials;

class Person implements Comparable<Person> {
	private int age;
	private String name;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(age, otherPerson.age);
	}
}

public class BoundtypeGeneric {

	public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
		if (num1.compareTo(num2) < 0)
			return num1;
		return num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateMin(new Person("Adam", 45), new Person("Kevin", 7)));
	}

}
