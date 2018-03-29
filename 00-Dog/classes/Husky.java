package classes;

public class Husky extends Dog {

	public Husky(String name, int health, int age, int joy) {
		this.name = name;
		this.health = health;
		this.age = age;
		this.joy = joy;
	}

	public void bark() {
		System.out.println("Ruff! Ruff!");
	}

	public void play() {
		System.out.println("Let's go play!");
		joy = joy + 20;
	}
}