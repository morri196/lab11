package Players;

public class BasketballPlayer extends Player {
	
	private double freethrowPercentage;
	
	public BasketballPlayer(String name, int jersey, double freethrowPercentage) {
		// Must call one of the constructors from the superclass
		// super constructor call must be the first line.
		super(name, jersey);
		this.freethrowPercentage = freethrowPercentage;
	}
	
	public BasketballPlayer() {
		// Or if we don't call one explicitly, Java automatically calls
		// the default (no-arg) constructor.
	}

	public double getFreethrowPercentage() {
		return freethrowPercentage;
	}

	public void setFreethrowPercentage(double freethrowPercentage) {
		this.freethrowPercentage = freethrowPercentage;
	}

	// Overriding replaces the superclass method with a new method
	@Override
	public String toString() {
		return "BasketballPlayer [freethrowPercentage=" + freethrowPercentage + ", name=" + getName()
				+ ", name=" + getJersey() + "]";
	}
	
	
	
}