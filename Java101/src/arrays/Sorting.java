package arrays;

import java.util.Scanner;
import java.util.Arrays;

// Program that takes the size of the array and the elements of the array from the user and sorts the elements from smallest to largest
public class Sorting {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = input.nextInt();
         int[] arr = new int[size];
         for(int i=0 ; i<size ; i++){
             System.out.print("Enter the " + (i+1) + ". eleman: ");
             arr[i] = input.nextInt();
         }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

     }
}
