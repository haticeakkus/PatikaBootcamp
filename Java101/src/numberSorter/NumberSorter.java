package numberSorter;

import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        int smallest, middle, largest;

        // Find the smallest number
        if (n1 <= n2 && n1 <= n3) {
            smallest = n1;
            if (n2 <= n3) {
                middle = n2;
                largest = n3;
            } else {
                middle = n3;
                largest = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            smallest = n2;
            if (n1 <= n3) {
                middle = n1;
                largest = n3;
            } else {
                middle = n3;
                largest = n1;
            }
        } else {
            smallest = n3;
            if (n1 <= n2) {
                middle = n1;
                largest = n2;
            } else {
                middle = n2;
                largest = n1;
            }
        }

        System.out.println("Numbers in ascending order: " + smallest + ", " + middle + ", " + largest);
    }
}
