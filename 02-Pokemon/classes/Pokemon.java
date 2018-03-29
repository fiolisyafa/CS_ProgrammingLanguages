package classes;

public class Pokemon {

	String name;
	String type;
	int defense;
	int health;
	int pp1;
	int pp2;
	int pp3;
	int pp4;
	int pp;
	int damage;

	public Pokemon(){}

	public Pokemon(String name, String type, int defense, int health) {
		this.name = name;
		this.type = type;
		this.defense = defense;
		this.health = health;
		this.pp = pp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setDefense(int newdefense) {
		this.defense = newdefense;
	}

	public int getDefense() {
		return this.defense;
	}

	public void setHealth(int newhealth) {
		this.health = newhealth;
	}

	public int getHealth(int damage) {
		this.health -= damage;
		return this.health;
	}

	public void setPowerPoints() {
		this.pp = this.pp1 + this.pp2 + this.pp3 + this.pp4;
	}

	public int getPowerPoints() {
		return this.pp;
	}

	public void stats() {
		System.out.println("\tName: " + this.name);
		System.out.println("\tType: " + this.type);
		System.out.println("\tDefense Level: " + this.defense);
		System.out.println("\tHealth: " + this.health);
	}

	public int attack() {
		return damage;
	}

	public int enemy() {
		return damage;
	}
}