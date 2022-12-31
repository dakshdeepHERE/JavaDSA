package CollegeClass;

import java.util.*;
public class HSort {

    public static void heapify(int[] arr, int length, int i)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < length && arr[left] > arr[largest])
        {
            largest = left;
        }
        if (right < length && arr[right] > arr[largest])
        {
            largest = right;
        }
        if (largest != i)
        {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, length, largest);
        }
    }

    public static void heapSort(int[] arr) {
        if (arr.length == 0)
        {
            return;
        }

        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--)
        {
            heapify(arr, length, i);
        }

        for (int i = length - 1; i >= 0; i--)
        {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {27, 12, 9, 43, 38, 53, 6};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
