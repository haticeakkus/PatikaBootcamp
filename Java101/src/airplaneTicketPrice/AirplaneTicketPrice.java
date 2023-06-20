package airplaneTicketPrice;

import java.util.Scanner;

public class AirplaneTicketPrice {
    public static void main(String[] args) {
        int distance, age, travelType;
        double price;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the travel type (1 => One Way, 2 => Round Trip): ");
        travelType = input.nextInt();

        if(distance < 0 || age < 0 || !(travelType == 1 || travelType == 2)){
            System.out.println("Wrong value");
        }
        else{
            price = distance * 0.10;
            if(age < 12){
                price *= 0.5;
            } else if (age<24) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if(travelType == 2){
                price *= 0.8;
                price *= 2;
            }
            System.out.println("Total price: " + price);
        }
    }
}
