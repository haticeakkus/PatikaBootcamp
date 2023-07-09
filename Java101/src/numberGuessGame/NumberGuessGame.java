package numberGuessGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

    //    System.out.println("The number to guess: " + number);
        while (right < 5) {
            System.out.print("Enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining attempts: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your attempts will be deducted for incorrect entries from now on.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! The number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Incorrect number!");
                if (selected > number) {
                    System.out.println(selected + " is greater than the hidden number.");
                } else {
                    System.out.println(selected + " is smaller than the hidden number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining attempts: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost!");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

    }
}
