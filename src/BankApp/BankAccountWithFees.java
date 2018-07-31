package BankApp;

public class BankAccountWithFee extends BankAccount {
	
	private double monthlyFee;

	public BankAccountWithFee() {
		super();
	}

	public BankAccountWithFee(double interestRate, double balance, double monthlyFee) {
		super(interestRate, balance);
		this.monthlyFee = monthlyFee;
	}
	
	public void applyFee() {
		setBalance(getBalance() - monthlyFee);
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	@Override
	public String toString() {
		return "BankAccountWithFee [monthlyFee=" + monthlyFee + "] extends " + super.toString();
		
//		return "BankAccountWithFee [monthlyFee=" + monthlyFee + ", getInterestRate()=" + getInterestRate()
//				+ ", getBalance()=" + getBalance() + "]";
	}

}