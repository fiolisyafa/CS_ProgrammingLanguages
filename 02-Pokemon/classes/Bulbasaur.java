package classes;
import java.util.Scanner;
import java.util.Random;

public class Bulbasaur extends Pokemon {

	String name;
	String type;
	int defense;
	int health;
	int pp1 = 35;
	int pp2 = 15;
	int pp3 = 25;
	int pp4 = 25;
	int pp = pp1 + pp2 + pp3 + pp4;
	int mydamage = 0;
	int enemydamage = 0;

	Scanner myscanner = new Scanner(System.in);
	Random enemymove = new Random();

	public Bulbasaur(){}

	public Bulbasaur(String name, String type, int defense, int health) {
		this.name = name;
		this.type = type;
		this.defense = defense;
		this.health = health;
	}

	public int tackle() {
		this.pp1 -= 1;
		return this.pp1;
	}

	public int seedBomb() {
		this.pp2 -= 1;
		return this.pp2;
	}

	public int razorLeaf() {
		this.pp3 -= 1;
		return this.pp3;
	}

	public int vineWhip() {
		this.pp4 -= 1;
		return this.pp4;
	}

	public int attack() {

		System.out.println("Your health: " + super.getHealth(this.enemydamage));
		
		System.out.println("Choose your move:\n\t1) Tackle " + this.pp1 + "\n\t2) Seed bomb " + this.pp2 + "\n\t3) Razor leaf " + this.pp3 + "\n\t4) Vine whip " + this.pp4 + "\n\t5) Exit");

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
				System.out.println("You used SEED BOMB");
				this.seedBomb();
				// power = 80
				// acc = 100
				this.mydamage = 8;
				break;
			case 3:
				System.out.println("You used RAZOR LEAF");
				this.razorLeaf();
				// power = 55
				// acc = 95
				this.mydamage = 5;
				break;
			case 4:
				System.out.println("You used VINE WHIP");
				this.vineWhip();
				// power = 45
				// acc = 100
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
			System.out.println("Your rival used TACKLE");
			this.tackle();
			this.enemydamage = 4;
		}
		else if (z == 2) {
			System.out.println("Your rival used SEED BOMB");
			this.seedBomb();
			this.enemydamage = 8;
		}
		else if (z == 3) {
			System.out.println("Your rival used RAZOR LEAF");
			this.razorLeaf();
			this.enemydamage = 5;
		}
		else if (z == 4) {
			System.out.println("Your rival used VINE WHIP");
			this.vineWhip();
			this.enemydamage = 4;
		}
		return this.enemydamage;
	}
}