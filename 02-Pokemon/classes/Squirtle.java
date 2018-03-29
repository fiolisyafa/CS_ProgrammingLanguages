package classes;
import java.util.Scanner;
import java.util.Random;

public class Squirtle extends Pokemon {

	String name;
	String type;
	int defense;
	int health;
	int pp1 = 35;
	int pp2 = 30;
	int pp3 = 20;
	int pp4 = 10;
	int pp = pp1 + pp2 + pp3 + pp4;
	int mydamage = 0;
	int enemydamage = 0;

	Scanner myscanner = new Scanner(System.in);
	Random enemymove = new Random();

	public Squirtle (){}

	public Squirtle(String name, String type, int defense, int health) {
		this.name = name;
		this.type = type;
		this.defense = defense;
		this.health = health;
	}

	public int tackle() {
		this.pp1 -= 1;
		return this.pp1;
	}

	public int bubble() {
		this.pp2 -= 1;
		return this.pp2;
	}

	public int waterPulse() {
		this.pp3 -= 1;
		return this.pp3;
	}

	public int aquaTail() {
		this.pp4 -= 1;
		return this.pp4;
	}

	public int attack() {

		System.out.println("Your health: " + super.getHealth(this.enemydamage));

		System.out.println("Choose your move:\n\t1) Tackle " + this.pp2 + "\n\t2) Bubble " + this.pp2 + "\n\t3) Water pulse " + this.pp3 + "\n\t4) Aqua tail " + this.pp4 + "\n\t5) Exit");

		int move = Integer.parseInt(myscanner.next());

		switch (move) {
			case 1:
				System.out.println("You used TACKLE");
				this.tackle();
				// power = 40
				// acc = 100
				this.mydamage = 4;
				break;
			case 2:
				System.out.println("You used BUBBLE");
				this.bubble();
				// power = 40
				// acc = 100
				this.mydamage = 4;
				break;
			case 3:
				System.out.println("You used WATER PULSE");
				this.waterPulse();
				// power = 60
				// acc = 100
				this.mydamage = 6;
				break;
			case 4:
				System.out.println("You used AQUA TAIL");
				this.aquaTail();
				// power = 90
				// acc = 90
				this.mydamage = 9;
				break;
			case 5:
				break;
			default:
				break;
		}
		return this.mydamage;
	}

	public int enemy() {

		System.out.println("Rival's health: " + super.getHealth(this.mydamage));		

		int z = enemymove.nextInt(4)+1;

		if (z == 1) {
			System.out.println("Your rival used TACKLE");
			this.tackle();
			this.enemydamage = 4;
		}
		else if (z == 2) {
			System.out.println("Your rival used BUBBLE");
			this.bubble();
			this.enemydamage = 4;
		}
		else if (z == 3) {
			System.out.println("Your rival used WATER PULSE");
			this.waterPulse();
			this.enemydamage = 6;
		}
		else if (z == 4) {
			System.out.println("Your rival used AQUA TAIL");
			this.aquaTail();
			this.enemydamage = 9;
		}
		return this.enemydamage;
	}
}