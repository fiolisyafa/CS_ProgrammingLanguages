package classes;

public class Dog {

	String name;
	int health;
	int age;
	int joy;

	public Dog (){}

	public Dog(String name, int health, int age, int joy) {
		this.name = name;
		this.health = health;
		this.age = age;
		this.joy = joy;

	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public int getAge() {
		return this.age;
	}

	public int getJoy() {
		return this.joy;
	}

	public void bark(){
		System.out.println("Woof!");
	}

	public void eat() {
		health = health + 5;
	}

	public void play() {
		System.out.println("Let's go play!");
		joy = joy + 10;
	}
}