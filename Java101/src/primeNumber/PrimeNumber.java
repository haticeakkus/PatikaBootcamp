package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number, flag=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Prime numbers up to the number you entered: ");

        for (int i=2 ; i<=number ; i++){
            for(int divider=2 ; divider<i ; divider++){
                if(i % divider == 0){
                    flag = 1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==0){
                System.out.print(i + " ");
            }
        }
    }
}
