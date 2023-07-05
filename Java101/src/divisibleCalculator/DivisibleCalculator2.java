package divisibleCalculator;

import java.util.Scanner;

public class DivisibleCalculator2 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number(odd number to exit): ");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
        }while(number % 2 == 0);

        System.out.println("The sum of the numbers you enter divisible by 4: " + sum);
    }
}
