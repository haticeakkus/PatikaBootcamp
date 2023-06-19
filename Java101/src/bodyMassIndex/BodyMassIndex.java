package bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, index;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height(in m): ");
        height = input.nextDouble();
        System.out.print("Enter your weight(in kg): ");
        weight = input.nextDouble();

        index = weight / (height * height);

        System.out.println("Your body mass index: " + index);

        if (index < 18.5) {
            System.out.println("Results: Below ideal weight");
        } else if (index >= 18.5 && index <= 24.9) {
            System.out.println("Results: Ideal weight");
        } else if (index >= 25 && index <= 29.9) {
            System.out.println("Results: Above ideal weight");
        } else if (index >= 30 && index <= 39.9) {
            System.out.println("Results: Very above ideal weight (obese)");
        } else {
            System.out.println("Results: Very above ideal weight (morbidly obese)");
        }
    }
}
