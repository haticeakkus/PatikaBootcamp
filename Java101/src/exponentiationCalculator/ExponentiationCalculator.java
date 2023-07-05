package exponentiationCalculator;

import java.util.Scanner;

// Program that calculates exponential numbers with "for loop"
public class ExponentiationCalculator {
    public static void main(String[] args) {
        int base, exponent, result = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = input.nextInt();
        System.out.print("Enter exponent: ");
        exponent = input.nextInt();

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
