package harmonicSeries;

import java.util.Scanner;

// program to find the harmonic series of the entered number
public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        int i=1;
        while(i <= number){
            sum += (1.0/i);
            i++;
        }

        System.out.println("Harmonic series sum: " + sum);

    }
}
