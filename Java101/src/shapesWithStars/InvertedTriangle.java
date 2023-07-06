package shapesWithStars;

import java.util.Scanner;

// Inverted triangle with starts
public class InvertedTriangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for(int i=number ; i > 0 ; i--){
            for(int k=0 ; k < (number - i) ; k++){
                System.out.print(" ");
            }
            for (int j=i ; j>0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
