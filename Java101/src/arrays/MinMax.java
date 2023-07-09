package arrays;

// Program to find the max and min values of the elements in the array
public class MinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for(int num : list){
            if(num < min)
                min = num;

            if(num > max)
                max = num;
        }

        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
    }
}
