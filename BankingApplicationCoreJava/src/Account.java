import java.util.Scanner;

public class Account {
	private int customerId;
	private String customerName;
	private int balance;
	private int previousTransaction;

	// constructor of account class
	public Account(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	// withdrawl() method
	void withdrawl(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		System.out.println("withdrawn amount: " + amount);
		System.out.println("Current Balance: " + balance);
	}

	// deposit() method
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = +amount;
		}
		System.out.println("deposited amount: " + amount);
		System.out.println("Current Balance: " + balance);
	}

	// previousTransaction() method
	void previousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited Transaction is: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawl Transaction is: " + previousTransaction);
		} else {
			System.out.println("No Transactions occured");
		}
	}

	// showMenu() method
	void showMenu() {
		int counter = 1;
		System.out.println("Welcome " + customerName);
		System.out.println("Account ID: " + customerId);
		System.out.println("***************************************************************");
		System.out.println("1 for Chcek Balance");
		System.out.println("2 for Deposit");
		System.out.println("3 for Withdrawl");
		System.out.println("4 for Previous Transaction");
		System.out.println("5 for Exit");
		System.out.println("***************************************************************");

		do {
			System.out.println("Enter Option: ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("***************************************************************");
				System.out.println("Current Balance : " + balance);
				System.out.println("***************************************************************");
				break;
			case 2:
				System.out.println("***************************************************************");
				System.out.println("Enter Amount to be deposited: ");
				int depamount = sc.nextInt();
				deposit(depamount);
				System.out.println("***************************************************************");
				break;
			case 3:
				System.out.println("***************************************************************");
				System.out.println("Enter Amount to be withdrwan: ");
				int withamount = sc.nextInt();
				withdrawl(withamount);
				System.out.println("***************************************************************");

				break;
			case 4:
				System.out.println("***************************************************************");
				System.out.println("Transaction History: ");
				previousTransaction();
				System.out.println("***************************************************************");
				break;
			case 5:
				System.out.println("***************************************************************");
				System.out.println("Thank You!");
				counter = 0;
				System.out.println("***************************************************************");
				break;
			default:
				System.out.println("Enter Correct Option!");
				sc.close();

			}
		} while (counter == 1);

	}

}
