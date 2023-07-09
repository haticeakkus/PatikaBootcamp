package arrays;

// Program to calculate harmonic mean of numbers in array
public class HarmonicAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double harmonicAverage = numbers.length / sum;

        System.out.println("Harmonic Average of the Series: " + harmonicAverage);
    }
}
