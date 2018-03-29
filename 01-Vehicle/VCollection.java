import classes.Vehicle;
import classes.Car;
import classes.Motorcycle;
import java.util.Scanner;
import java.util.Arrays;

public class VCollection {

	public static void main(String[] args) {

		String[] varray = new String[6];
		Scanner myscanner = new Scanner(System.in);
		boolean loop = true;
		int print;
		int assess;
		int data;

		Car car1 = new Car("Car", "Nissan March", "White", "1134SVI");
		Car car2 = new Car("Car", "Daihatsu Ayla", "White", "1940SIZ");
		Car car3 = new Car("Car", "Toyota Innova", "White", "504DEB");
		Car car4 = new Car("Car", "Mercedez Benz C240", "Black", "504DS");
		Motorcycle motorcycle1 = new Motorcycle("Motorcycle", "Harley Davidson", "99BGV");
		Motorcycle motorcycle2 = new Motorcycle("Motorcycle", "Ducati", "404ERR");

		varray[0] = car1.getName();
		varray[1] = car2.getName();
		varray[2] = car3.getName();
		varray[3] = car4.getName();
		varray[4] = motorcycle1.getName();
		varray[5] = motorcycle2.getName();

		while(loop) {
			System.out.println("What would you like to do? 1) Print data 2) Exit");
			print = Integer.parseInt(myscanner.next());
			switch (print) {
				case 1:
					System.out.println(Arrays.toString(varray));
					System.out.println("Would you like to assess data? 1) Yes 2) No");
					assess = Integer.parseInt(myscanner.next());
					switch (assess) {
						case 1:
							System.out.println("Which data? 1) 2) 3) 4) 5) 6)");
							data = Integer.parseInt(myscanner.next());
							switch (data) {
								case 1:
									car1.getStats();
									break;
								case 2:
									car2.getStats();
									break;
								case 3:
									car3.getStats();
									break;
								case 4:
									car4.getStats();
									break;
								case 5:
									motorcycle1.getStats();
									break;
								case 6:
									motorcycle2.getStats();
									break;
								default:
									break;
							}
						case 2:
							continue;
						default:
							break;
					}
				case 2:
					loop = false;
					break;
				default:
					break;	
			}
		}
	}
}