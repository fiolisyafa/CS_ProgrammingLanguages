import classes.Pokemon;
import classes.Charmander;
import classes.Squirtle;
import classes.Bulbasaur;
import java.util.Scanner;
import java.util.Random;

public class Battle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random selectrival = new Random();
		int selectpokemon;
		int selectaction;		
		Pokemon mypokemon = null;
		Pokemon rival = null;

		System.out.println("Choose your Pokemon:\n1) Charmander\n2) Squirtle\n3) Bulbasaur\n4) Exit");
		selectpokemon = Integer.parseInt(input.next());

		switch (selectpokemon) {
			case 1:
				mypokemon = new Charmander();
				mypokemon.setName("Charmander");
				mypokemon.setType("Fire");
				mypokemon.setDefense(43);
				mypokemon.setHealth(39);
				break;
			case 2:
				mypokemon = new Squirtle();
				mypokemon.setName("Squirtle");
				mypokemon.setType("Water");
				mypokemon.setDefense(65);
				mypokemon.setHealth(44);
				break;
			case 3:
				mypokemon = new Bulbasaur();
				mypokemon.setName("Bulbasaur");
				mypokemon.setType("Grass");
				mypokemon.setDefense(49);
				mypokemon.setHealth(45);
				break;
			case 4:
				break;
			default:
				break;
		}

		System.out.println("You selected:");
		mypokemon.stats();

		System.out.println("What would you like to do?\n1) Battle\n2) Exit");
		selectaction = Integer.parseInt(input.next());

		switch (selectaction) {
			case 1:			
				int y = selectrival.nextInt(3)+1;
				if (y == 1) {
					rival = new Charmander();
					rival.setName("Charmander");
					rival.setType("Fire");
					rival.setDefense(43);
					rival.setHealth(39);
				}
				else if (y == 2) {
					rival = new Squirtle();
					rival.setName("Squirtle");
					rival.setType("Water");
					rival.setDefense(65);
					rival.setHealth(44);
				}
				else if (y == 3) {
					rival = new Bulbasaur();
					rival.setName("Bulbasaur");
					rival.setType("Grass");
					rival.setDefense(49);
					rival.setHealth(45);
				}

				System.out.println("Your rival wants to battle!");
				System.out.println("Your rival sent: ");
				rival.stats();

				boolean gameloop = true;

				while (gameloop) {
					if (rival.getHealth(mypokemon.attack()) <= 0) {
						System.out.println("Rival " + rival.getName() + " fainted!");
						System.out.println("You defeated your rival!");
						gameloop = false;
					}
					else if (mypokemon.getHealth(rival.enemy()) <= 0) {
						System.out.println("Your Pokemon" + mypokemon.getName() + " fainted!");
						System.out.println("Your rival defeated you!");
						gameloop = false;
					}
					else {
						mypokemon.attack();
						rival.enemy();
						// System.out.println("Your health: ");
						// System.out.println(mypokemon.getHealth(rival.enemy()));
						// System.out.println("Rival's health: ");
						// System.out.println(rival.getHealth(mypokemon.attack()));
					}
				}
				break;
			case 2:
				break;
			default:
				break;
		}
	}
}