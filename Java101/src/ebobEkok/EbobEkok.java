package ebobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        int ebob =1;
        int i=1;
        while(i<=number1){
            if(number1 % i == 0 && number2 % i == 0){
                ebob = i;
            }
            i++;
        }
        int ekok = (number1*number2)/ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}


