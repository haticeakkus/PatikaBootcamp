package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2;
        String operator;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter the operator: ");
        operator = input.nextLine();


        switch (operator){
            case "+":
                result =  n1 + n2;
                break;
            case "-":
                result =  n1 - n2;
                break;
            case "*":
                result =  n1 * n2;
                break;
            case "/":
                result =  n1 / n2;
                break;
            default:
                System.out.println("Wrong operation");
        }

        System.out.println("Result: " + result);
    }
}
