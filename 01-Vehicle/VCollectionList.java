import classes.Vehicle;
import classes.Car;
import classes.Motorcycle;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class VCollectionList {

	public static void main(String[] args) {

		ArrayList<Vehicle> varray = new ArrayList();
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

		varray.add(car1);
		varray.add(car2);
		varray.add(car3);
		varray.add(car4);
		varray.add(motorcycle1);
		varray.add(motorcycle2);

		while(loop) {
			System.out.println("What would you like to do? 1) Print data 2) Exit");
			print = Integer.parseInt(myscanner.next());
			switch (print) {
				case 1:
					for (int i=0; i<varray.size(); i++) {
						varray.get(i).getStats();
						System.out.println();
					}
					break;
				case 2:
					loop = false;
					break;
				default:
					break;	
			}
		}
	}
}