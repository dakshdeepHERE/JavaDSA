package CollegeClass;

public class Tree {
    public static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i,j,max = 0;

        for ( i = 0; i < n; i++ )
            lis[i] = 1;

        /* Compute optimized LIS values */
        for ( i = 1; i < n; i++ )
        {
            for ( j = 0; j < i; j++ )
            {
                if ( arr[i] > arr[j] &&
                        lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }

        /* Pick maximum of all LIS values */
        for ( i = 0; i < n; i++ )
            if ( max < lis[i] )
                max = lis[i];

        return max;
    }


    public static void main(String[] args) {

        int []arr= {32,42,9,21,34,49,41,45,32};

        int lis=lis(arr, arr.length);
        System.out.println("LIS:" +lis);

    }

}
