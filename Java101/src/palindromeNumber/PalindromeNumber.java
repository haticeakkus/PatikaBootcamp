package palindromeNumber;

import java.util.Scanner;

// Program to find out if the entered number is a palindrome (numbers that have the same reading when read from both sides)
public class PalindromeNumber {
    static boolean isPalindrome(int number){
        int temp = number, reverseNum = 0, lastNum, flag=0;

        while(temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        if(reverseNum == number){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(isPalindrome(number)){
            System.out.println(number + " is a polindrome number.");
        }
        else{
            System.out.println(number + " is not a polindrome number.");
        }
    }
}
