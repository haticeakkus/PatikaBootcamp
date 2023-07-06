package fibonacciSeries;

import java.util.Scanner;

// Fibonacci series with the number of elements entered
public class FibonacciSeries {
    public static void main(String[] args) {
        int n, firstNum=0, secondNum=1, element;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();

        System.out.print("Fibonacci series elements: ");
        System.out.print(firstNum + " " + secondNum + " ");
        for (int i=2 ; i<=n ; i++){
            element = firstNum + secondNum;
            System.out.print(element + " ");
            firstNum = secondNum;
            secondNum = element;
        }
    }
}
