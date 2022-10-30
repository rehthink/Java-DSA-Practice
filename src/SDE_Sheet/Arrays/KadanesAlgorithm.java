package SDE_Sheet.Arrays;

public class KadanesAlgorithm {

    /*
    *
    *
    * Given an array arr[] of size N.
    * The task is to find the sum of
    * the contiguous sub-array within
    * arr[] with the largest sum.
    *
    * O(n)
     * */

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is "
                + maxSubArray(a));

    }

    static int maxSubArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            sum = sum+arr[i];

            if (max<sum){
                max = sum;
            }

            if (sum<0){
                sum=0;
            }
        }
        return max;
    }
}
