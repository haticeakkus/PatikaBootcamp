package exponentiationCalculator;

import java.util.Scanner;

// Program that takes the base and exponent values from the user and performs the exponentiation process using the "Recursive" method.
public class ExponentiationCalculatorRecursive {
        static int power(int base, int exponent) {
            if (exponent == 0) {
                return 1;
            } else {
                return base * power(base, exponent - 1);
            }
        }

        public static void main(String[] args) {
            int base, exponent;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter base: ");
            base = input.nextInt();
            System.out.print("Enter exponent: ");
            exponent = input.nextInt();

            int result = power(base, exponent);
            System.out.println("Result: " + result);
        }
}
