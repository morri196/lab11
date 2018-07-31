package co.grandcircus.lab11;

import java.util.ArrayList;

import co.grandcircus.lab11.Car;

public class CarApp {

	public static void main(String[] args) {
		
		Car car1 = new Car("Ford", "Fusion", 2017, 29000);
		System.out.println(car1);
		
		usedCar car2 = new usedCar("Chrysler", "300", 2014, 30000, 29000);
		System.out.println(car2);
	}

}
