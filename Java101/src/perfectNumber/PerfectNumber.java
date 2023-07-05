package perfectNumber;

import java.util.Scanner;

// Program that determines whether the entered number is a perfect number.
public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int i=1;
        while(i < number){
            if(number % i == 0){
                sum += i;
            }
            i++;
        }

        if(sum == number){
            System.out.println(number + " is a perfect number");
        }
        else{
            System.out.println(number + " is not a perfect number");
        }

    }
}
