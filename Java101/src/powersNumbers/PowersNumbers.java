package powersNumbers;

import java.util.Scanner;

// A program that prints powers of 4 and 5 up to the entered number.
public class PowersNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Powers of 4: ");
        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println("\nPowers of 5:");
        for (int j = 1; j <= number; j *= 5) {
            System.out.print(j + " ");
        }

    }
}
