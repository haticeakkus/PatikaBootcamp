package circleFormulas;

import java.util.Scanner;

public class CircleFormulas {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double perimeter, area, angle, areaSegment;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        r = input.nextInt();

        perimeter = 2 * pi * r;
        area = pi * r * r;
        System.out.println("The area of the circle: " + area + "\nThe perimeter of the circle: " + perimeter + "\n\n");

        System.out.print("Enter the central angle measure of the circle segment whose area you want to know: ");
        angle = input.nextDouble();
        areaSegment = (area * angle) / 360;
        System.out.println("Area of the circle segment: " + areaSegment);
    }
}
