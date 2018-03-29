package classes;

public class Motorcycle extends Vehicle {
	String type;
	String name;
	String license;

	public Motorcycle(){}

	public Motorcycle(String type, String name, String license) {
		this.type = type;
		this.name = name;
		this.license = license;
	}

	public String getName() {
		return this.name;
	}

	public void getStats() {
		System.out.println("Type: " + this.type);
		System.out.println("Name: " + this.name);
		System.out.println("License: " + this.license);
	}
}