package combinationCalculator;

import java.util.Scanner;

// Combination calculator
public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = input.nextInt();
        System.out.print("Enter the number of elements to be selected (r): ");
        int r = input.nextInt();

        int comb = fact(n) / (fact(r) * fact(n - r));

        System.out.println("C(" + n + ", " + r + ") = " + comb);
    }

    public static int fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
