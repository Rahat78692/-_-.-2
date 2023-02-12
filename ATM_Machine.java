import java.util.Scanner;

public class ATM_Machine {
	private static Scanner sc = new Scanner(System.in);
	private static int balance = 1000;

	public static void main(String[] args) {
		while (true) {
			System.out.println("Welcome to the ATM");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					checkBalance();
					break;
				case 2:
					depositMoney();
					break;
				case 3:
					withdrawMoney();
					break;
				case 4:
					System.out.println("Thank you for using the ATM. Have a great day!");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void checkBalance() {
		System.out.println("Your balance is: $" + balance);
	}

	private static void depositMoney() {
		System.out.print("Enter the amount you want to deposit: $");
		int amount = sc.nextInt();
		balance += amount;
		System.out.println("$" + amount + " has been deposited successfully.");
	}

	private static void withdrawMoney() {
		System.out.print("Enter the amount you want to withdraw: $");
		int amount = sc.nextInt();
		if (balance - amount < 0) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= amount;
			System.out.println("$" + amount + " has been withdrawn successfully.");
		}
	}
}
