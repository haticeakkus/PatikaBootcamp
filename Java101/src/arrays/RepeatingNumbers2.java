package arrays;

// Program to find how many times elements in array are repeated
public class RepeatingNumbers2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 4, 2, 5, 7, 9, 8, 8, 5, 5, 9, 0};
        int[] repeatingNums = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
            int count = 1;
            if (repeatingNums[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    repeatingNums[j] = -1;
                }
            }
            repeatingNums[i] = count;
        }

        System.out.println("Repeat Counts:");
        for(int i=0 ; i< numbers.length ; i++){
            if(repeatingNums[i] > 0){
                System.out.println(numbers[i] + " was repeated " + repeatingNums[i] + " times.");
            }
        }
    }
}
