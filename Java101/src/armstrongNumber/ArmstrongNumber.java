package armstrongNumber;

import java.util.Scanner;

// Program to calculate whether the entered number is armstrong or not
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0, numberOfDigits = 0, temp;
        temp = number;

        while (temp != 0) {
            temp /= 10;
            numberOfDigits++;
        }

        while (number != 0) {
            int digit = number % 10;
            int digitPower = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                digitPower *= digit;
            }
            sum += digitPower;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

