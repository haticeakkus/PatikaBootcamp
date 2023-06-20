package gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        String state;
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
/*
        //Condition calculation without using if
        state = average > 60 ? "Congratulations! You passed the class" : "Unfortunately! You failed the course";
*/


        //Condition calculation using if
        if(average > 60 && average <=100){
            state = "Congratulations! You passed the class";
        }
        else if(average > 0 && average <= 60){
            state = "Unfortunately! You failed the course";
        }
        else{
            state = "You entered wrong grades! ";
        }


        System.out.println("Your average is: " + average + "\n" + state);
    }
}
