package gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grades");
        System.out.print("Physics grade: ");
        int physicsG = input.nextInt();
        System.out.print("Literature grade: ");
        int literatureG = input.nextInt();
        System.out.print("Biology grade: ");
        int biologyG = input.nextInt();
        System.out.print("History grade: ");
        int historyG = input.nextInt();

        float average = (float) ((physicsG + literatureG + biologyG + historyG) / 4.0);
        String state = average > 60 ? "Congratulations! You passed the class" : "Unfortunately! You failed the course";
        System.out.println("Your average is: " + average + "\n" + state);
    }
}
