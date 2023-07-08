package patternCreation;

import java.util.Scanner;

// Subtract 5 from the entered number up to where the entered number is 0 or negative. Print the last value to the screen during each subtraction.
// Add 5 again after the number is negative or 0.
// Again, print the last value of the number on the screen in each addition operation.
public class PatternCreation {
    static void pattern(int n){
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }
        pattern(n - 5);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n number: ");
        n = input.nextInt();
        pattern(n);
    }
}
