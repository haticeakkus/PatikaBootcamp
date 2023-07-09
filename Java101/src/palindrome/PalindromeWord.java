package palindrome;

import java.util.Scanner;

// Program that finds whether the word entered by the user is "palindromic"
public class PalindromeWord {
    static boolean isPalindrome(String word){
        String reverseWord = "";
        for(int i=word.length()-1 ; i>=0 ; i--){
           reverseWord += word.charAt(i);
        }
        if(reverseWord.equals(word)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if(isPalindrome(word)){
            System.out.println(word + " is a polindrome word.");
        }
        else{
            System.out.println(word + " is not a polindrome word.");
        }
    }
}
