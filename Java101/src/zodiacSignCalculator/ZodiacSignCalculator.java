package zodiacSignCalculator;

import java.util.Scanner;

public class ZodiacSignCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (numeric value): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();

        String zodiacSign;

        if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            zodiacSign = "Aquarius";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            zodiacSign = "Aries";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            zodiacSign = "Taurus";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 21)) {
            zodiacSign = "Gemini";
        } else if ((month == 6 && day >= 22) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            zodiacSign = "Capricorn";
        } else {
            zodiacSign = "Invalid date";
        }

        System.out.println("Your Zodiac Sign: " + zodiacSign);

    }
}
