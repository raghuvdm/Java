package Bank_Concept;

public class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	// Alt shift : s and r: getters and setters 
	public double getAmount() {
		return amount;
	}

}// class
