package CollegeClass;

public class Practice {
    static int maxSumIncSubseq(int arr[], int n) {
        int i, j, max = 0;
        int maxSumIS[] = new int[n];

        for (i = 0; i < n; i++)
            maxSumIS[i] = arr[i];

        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && maxSumIS[i] < maxSumIS[j] + arr[i])
                    maxSumIS[i] = maxSumIS[j] + arr[i];

        for (i = 0; i < n; i++)
            if (max < maxSumIS[i])
                max = maxSumIS[i];

        return max;
    }

    public static void main(String[] args)
    {
        int []arr= {1,4,20,6,15,5,9};

        int max=maxSumIncSubseq(arr, arr.length);
        System.out.println("Max Inc Sub:" +max);
    }
}
