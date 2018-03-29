package classes;

public class Car extends Vehicle {
	String type;
	String name;
	String color;
	String license;

	public Car(){}

	public Car(String type, String name, String color, String license) {
		this.type = type;
		this.name = name;
		this.color = color;
		this.license = license;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public void getStats() {
		System.out.println("Type: " + this.type);
		System.out.println("Name: " + this.name);
		System.out.println("Color: " + this.color);
		System.out.println("License: " + this.license);
	}
}