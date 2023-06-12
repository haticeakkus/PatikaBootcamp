package kdvCalculator;

import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        double price;
        double kdvB = 0.18;
        double kdvS = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price = input.nextDouble();
        double totalPrice =price + ((price > 0 && price <= 1000) ? price * kdvB : price * kdvS);
        System.out.println("Taxed price: " + totalPrice);
    }
}

