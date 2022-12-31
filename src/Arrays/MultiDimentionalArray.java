package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println(arr.length);
        // for input
        for (int row = 0; row < arr.length; row++) {
            // now the input for the columns
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // for output 
//
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //there is also a concept of dynamic array its nothing but the row will keep on changing
    }
}
