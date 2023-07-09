package arrays;

// Program to find repeating even numbers in array
public class RepeatingNumbers {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 4, 2, 5, 7, 9, 8, 8, 5, 5, 9, 0};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }
}
