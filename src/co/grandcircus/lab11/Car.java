package co.grandcircus.lab11;

public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	
	//constructor
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

//default constructor
	public Car() {
		super();
	}

//getters and setters
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

//toString
	@Override
	public String toString() {
		String car = String.format("%-10s %-10s %d\t$%,10.2f", make, model, year, price, "\n");
		return  car;
	}
	
	
	
	
	
}

