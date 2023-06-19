package taximeter;

import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args) {
        double price = 10.0;
        int km;
        double perKm = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Write the distance in km: ");
        km = input.nextInt();
        price += km*perKm;
        price = (price < 20) ? 20 : price;

        System.out.println("Total price: " + price);
    }
}
