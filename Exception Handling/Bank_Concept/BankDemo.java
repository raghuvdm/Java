package Bank_Concept;

import java.util.Scanner;

public class BankDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int input = sc.nextInt();

		CheckingAccount c1 = new CheckingAccount(input);

		System.out.println();
		System.out.println("Depositing: $500");
		c1.deposit(500.00);
		System.out.println("Acc Balance: " + c1.getBalance());
		System.out.println("Acc Number: " + c1.getNumber());

		try {
			System.out.println("\nWithdrawing: $100");
			c1.withdraw(100.00);
			System.out.println("Acc Balance: " + c1.getBalance());
			System.out.println("Acc Number: " + c1.getNumber());

			// Again Withdrawing:-
			System.out.println("\nWithdrawing: $600");
			c1.withdraw(600.00);
			System.out.println("Acc Balance: " + c1.getBalance());
			System.out.println("Acc Number: " + c1.getNumber());

		} catch (InsufficientFundsException e) {
			System.out.println("Sorry, but you are short $: " + e.getAmount());
			System.out.println("Acc Number: " + c1.getNumber());
			System.out.println();
			e.printStackTrace();
		}

	}// main()
}// main class
