import classes.Dog;
import classes.Hound;
import classes.Husky;
import classes.Beagle;

public class test2 {

	public static void main(String[] args) {

		Dog dog = new Dog("Milka", 100, 1, 20);
		Husky dog2 = new Husky("Milo", 100, 1, 30);
		Hound dog3 = new Hound();
		Beagle dog4 = new Beagle();

		System.out.println("Name: " + dog.getName());
		System.out.println("Health: " + dog.getHealth());
		System.out.println("Age: " + dog.getAge());
		System.out.println("Joy level: " + dog.getJoy());

		dog.bark();
		dog.eat();
		dog.play();
		System.out.println("Joy level: " + dog.getJoy());

		System.out.println("Name: " + dog2.getName());
		System.out.println("Health: " + dog2.getHealth());
		System.out.println("Age: " + dog2.getAge());
		System.out.println("Joy level: " + dog2.getJoy());

		dog2.bark();
		dog2.eat();
		dog2.play();
		System.out.println("Joy level: " + dog2.getJoy());

		dog3.bark();

		dog4.play();

	}
}