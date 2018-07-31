package BankApp;

public class BankAccount {
	
	private double interestRate;
	private double balance;
	
	public BankAccount(double interestRate, double balance) {
		super();
		this.interestRate = interestRate;
		this.balance = balance;
	}
	
	public BankAccount() {}
	
	public void accrueInterest() {
		balance += (balance * (interestRate / 100));
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [interestRate=" + interestRate + ", balance=" + balance + "]";
	}
	
}