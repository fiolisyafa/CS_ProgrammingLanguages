package classes;
import java.util.Scanner;
import java.util.Random;

public class Charmander extends Pokemon {

	String name;
	String type;
	int defense;
	int health;
	int pp1 = 15;
	int pp2 = 25;
	int pp3 = 15;
	int pp4 = 35;
	int pp = pp1 + pp2 + pp3 + pp4;
	int mydamage = 0;
	int enemydamage = 0;

	Scanner myscanner = new Scanner(System.in);
	Random enemymove = new Random();

	public Charmander(){}

	public Charmander(String name, String type, int defense, int health) {
		this.name = name;
		this.type = type;
		this.defense = defense;
		this.health = health;
	}

	public int flamethrower() {
		this.pp1 -= 1;
		return this.pp1;
	}

	public int ember() {
		this.pp2 -= 1;
		return this.pp2;
	}

	public int fireFang() {
		this.pp3 -= 1;
		return this.pp3;
	}

	public int scratch() {
		this.pp4 -= 1;
		return this.pp4;
	}

	public int attack() {

		System.out.println("Your health: " + super.getHealth(this.enemydamage));

		System.out.println("Choose your move:\n\t1) Flamethrower " + this.pp1 + "\n\t2) Ember " + this.pp2 + "\n\t3) Fire fang " + this.pp3 + "\n\t4) Scratch " + this.pp4 + "\n\t5) Exit");

		int move = Integer.parseInt(myscanner.next());

		switch (move) {
			case 1:
				System.out.println("You used FLAMETHROWER");
				this.flamethrower();
				//power = 90
				//acc = 100
				this.mydamage = 9;
				break;
			case 2:
				System.out.println("You used EMBER");
				this.ember();
				//power = 40
				//acc = 100
				this.mydamage = 4;
				break;
			case 3:
				System.out.println("You used FIRE FANG");
				this.fireFang();
				//power = 65
				//acc = 95
				this.mydamage = 6;
				break;
			case 4:
				System.out.println("You used SCRATCH");
				this.scratch();
				//power = 40
				//acc = 100
				this.mydamage = 4;
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
			System.out.println("Your rival used FLAMETHROWER");
			this.flamethrower();
			this.enemydamage = 9;
		}
		else if (z == 2) {
			System.out.println("Your rival used EMBER");
			this.ember();
			this.enemydamage = 4;
		}
		else if (z == 3) {
			System.out.println("Your rival used FIRE FANG");
			this.fireFang();
			this.enemydamage = 6;
		}
		else if (z == 4) {
			System.out.println("Your rival used SCRATCH");
			this.scratch();
			this.enemydamage = 4;
		}
		return this.enemydamage;
	}
}