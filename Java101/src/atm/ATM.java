package atm;

import java.util.Scanner;

// ATM project where the user can manage their bank account
public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int attempts = 3, balance = 1500, choice;

        while (attempts > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");

                do {
                    System.out.println("1- Deposit Money\n" +
                            "2- Withdraw Money\n" +
                            "3- Check Balance\n" +
                            "4- Exit");
                    System.out.print("Please select an operation: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Amount to deposit: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Amount to withdraw: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                    }
                } while (choice != 4);

                System.out.println("Goodbye!");
                break;
            } else {
                attempts--;
                System.out.println("Invalid username or password. Please try again.");

                if (attempts == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + attempts);
                }
            }
        }
    }
}
