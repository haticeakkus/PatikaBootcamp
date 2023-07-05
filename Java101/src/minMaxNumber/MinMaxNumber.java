package minMaxNumber;

import java.util.Scanner;

// Program to find the max and min numbers from n counting numbers
public class MinMaxNumber {
    public static void main(String[] args) {
        int number, i=0, min=0, max=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (i == 0) {
                min = number;
                max = number;
            } else {
                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            }
            i++;
        } while (i < n);

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
