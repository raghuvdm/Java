package Bank_Concept;

public class CheckingAccount {
	private double balance;
	private int number;

	// Creating Acc number:-
	public CheckingAccount(int number) {
		this.number = number;
	}

	// Depositing:-
	public void deposit(double amount) {
		balance += amount;
	}

	// Withdraw:-
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	//Get Balance:-
	public double getBalance() {
		return balance;
	}

	//Get: Account number:-
	public int getNumber() {
		return number;
	}

}// class
