package co.grandcircus.lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarLot {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int selection = 0;
		
		ArrayList<Car> list = new ArrayList();
		list.add(new usedCar("Audi", "A8", 2015, 74000, 45000));
		list.add(new usedCar("Chrysler", "300", 2014, 30000, 5000));
		list.add(new usedCar("Ford", "Explorer", 2015, 32000, 29000));
		list.add(new Car("Ford", "Fusion", 2017, 29000));
		list.add(new Car("Jeep", "Cherokee", 2018, 48000));
		list.add(new Car("Dodge", "Durango", 2019, 52000));
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "." +list.get(i));
		}
		
		System.out.print("\n\nWhich car would you like? (1-6)");
		selection = scnr.nextInt();
		
		if ( selection == 1) {
			System.out.println(list.get(0));
			}
		else if (selection == 2) {
		        System.out.println(list.get(1));
		    }
		else if (selection == 3) {
				System.out.println(list.get(2));
			}
		else if (selection == 4) {
				System.out.println(list.get(3));
			}
		else if (selection == 5) {
				System.out.println(list.get(4));
			}
		else if (selection == 6) {
				System.out.println(list.get(5));
			}
		else {
			System.out.println("Please make a valid selection 1-6. ");
		}
		
		System.out.println("\nWould you like to remove this car, add to car list, or replace this car? ");
		

	}
}
