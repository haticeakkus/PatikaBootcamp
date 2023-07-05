package divisibleCalculator;

import java.util.Scanner;

public class DivisibleCalculator {
    public static void main(String[] args) {
        int number, sum = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i=1 ; i< number ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("The average of numbers that divisible by 3 and 4(up to the number you entered): " + (sum / count));
    }
}
