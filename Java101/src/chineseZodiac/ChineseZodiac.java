package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        int zodiacIndex;
        String zodiacSign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        zodiacIndex = birthYear % 12;

        switch (zodiacIndex) {
            case 0:
                zodiacSign = "Monkey";
                break;
            case 1:
                zodiacSign = "Rooster";
                break;
            case 2:
                zodiacSign = "Dog";
                break;
            case 3:
                zodiacSign = "Pig";
                break;
            case 4:
                zodiacSign = "Rat";
                break;
            case 5:
                zodiacSign = "Ox";
                break;
            case 6:
                zodiacSign = "Tiger";
                break;
            case 7:
                zodiacSign = "Rabbit";
                break;
            case 8:
                zodiacSign = "Dragon";
                break;
            case 9:
                zodiacSign = "Snake";
                break;
            case 10:
                zodiacSign = "Horse";
                break;
            case 11:
                zodiacSign = "Sheep";
                break;
            default:
                zodiacSign = "Invalid";
                break;
        }

        if (!zodiacSign.equals("Invalid")) {
            System.out.println("Your Chinese Zodiac sign is: " + zodiacSign);
        } else {
            System.out.println("Invalid birth year entered!");
        }
    }
}
