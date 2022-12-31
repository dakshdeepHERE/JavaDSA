package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=68;
        arr[1]=45;
        arr[2]=21;
        arr[3]=1;
        arr[4]=56;
        System.out.println(arr[4]);
        // input using for loop
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for( int num : arr){ // num is the integer element present in the array
//            System.out.print(num + " ");// here num represent the integers in the array
        }
    }

