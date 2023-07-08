package primeNumber;

import java.util.Scanner;

// Program that finds whether the number received from the user is a "Prime" number by using the "Recursive" method
public class PrimeNumberRecursive {
    static int isPrime(int number, int divider){
        if(divider == 1){
            return  1;
        }
        else{
            if(number % divider == 0){
                return 0;
            }
            else{
                return isPrime(number, --divider);
            }
        }
    }

    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(isPrime(number, number/2) == 1){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is not a prime number.");
        }
    }
}
