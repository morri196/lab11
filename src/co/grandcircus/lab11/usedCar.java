package co.grandcircus.lab11;

public class usedCar extends Car {
	
	private double mileage;

	public usedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public usedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		String usedCar = String.format( "%-10s %-10s %d\t$%,10.2f(used)%-10smiles", getMake() , getModel(), getYear() , getPrice() , mileage, "\n");
		return usedCar;
	}	
	
	
		
	}
	
	
	
	

