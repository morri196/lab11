package BankApp;

import java.util.ArrayList;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.setInterestRate(3);
		account1.setBalance(1000);
		
		account1.accrueInterest();
		account1.accrueInterest();
		account1.accrueInterest();
		// cannot call methods from subclass
		//account1.applyFee();

		System.out.println(account1);
		
		BankAccountWithFee account2 = new BankAccountWithFee();
		account2.setInterestRate(3);
		account2.setBalance(1000);
		account2.setMonthlyFee(5);
		
		// Can call methods from the superclass
		account2.accrueInterest();
		account2.applyFee();
		
		System.out.println(account2);
		
		// We can put all kinds of BankAccounts in this list.
		ArrayList<BankAccount> allAccounts = new ArrayList<>();
		allAccounts.add(account1);
		allAccounts.add(account2);
		
		// Let's do some accounting.
		for (BankAccount account : allAccounts) {
			// we can always accrue interest on all accounts
			account.accrueInterest();
			// check and see if this one is an account with fee
			if (account instanceof BankAccountWithFee) {
				// if so (force Java to let us) and apply the fee
				((BankAccountWithFee) account).applyFee();
				
				// You'll also see it broken out like this.
//				BankAccountWithFee accountWithFee = (BankAccountWithFee) account;
//				accountWithFee.applyFee();
			}
		}
	}

}