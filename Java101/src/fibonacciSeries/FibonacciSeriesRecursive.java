package fibonacciSeries;

import java.util.Scanner;

// Recursive Fibonacci series with entered number of elements
public class FibonacciSeriesRecursive {
    static int fibonacci(int n){
       if(n<=1){
           return n;
       }
       else{
           return fibonacci(n-1) + fibonacci(n-2);
       }
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();

        System.out.print("Fibonacci series elements: ");
        for (int i=0 ; i<n ; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
}
