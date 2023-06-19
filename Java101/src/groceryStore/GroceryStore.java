package groceryStore;

import java.util.Scanner;
public class GroceryStore {
            public static void main(String[] args) {
                double pearPrice = 2.14;
                double applePrice = 3.67;
                double tomatoPrice = 1.11;
                double bananaPrice = 0.95;
                double eggplantPrice = 5.00;

                Scanner input = new Scanner(System.in);
                System.out.print("How many kilograms of pears? : ");
                double pearKilos = input.nextDouble();

                System.out.print("How many kilograms of apples? : ");
                double appleKilos = input.nextDouble();

                System.out.print("How many kilograms of tomatoes? : ");
                double tomatoKilos = input.nextDouble();

                System.out.print("How many kilograms of bananas? : ");
                double bananaKilos = input.nextDouble();

                System.out.print("How many kilograms of eggplants? : ");
                double eggplantKilos = input.nextDouble();


                double totalPrice = (pearKilos * pearPrice) +
                        (appleKilos * applePrice) +
                        (tomatoKilos * tomatoPrice) +
                        (bananaKilos * bananaPrice) +
                        (eggplantKilos * eggplantPrice);

                System.out.println("Total price: " + totalPrice + " TL");
    }
}
