package triangleFormulas;

import java.util.Scanner;

public class TriangleFormulas {
    public static void main(String[] args) {
        // Calculating the perimeter and area of a triangle with known side lengths

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of first side of the triangle: ");
        float a = input.nextFloat();
        System.out.print("Enter size of second side of the triangle: ");
        float b = input.nextFloat();
        System.out.print("Enter size of third side of the triangle: ");
        float c = input.nextFloat();

        float u = (a+b+c) / 2;
        float perimeter = 2*u;
        float area = (float) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("The perimeter of the triangle is " + perimeter + ". \nThe area of the triangle is " + area);
    }
}
