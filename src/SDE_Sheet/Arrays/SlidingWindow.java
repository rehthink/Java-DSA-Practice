package SDE_Sheet.Arrays;

public class SlidingWindow {
    /*
    * Find sub-array with given sum using
    * Sliding Window
    *
    * O(N)
    *
     * */
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        subArraySum(arr, sum);

    }

    static int subArraySum(int[] arr, int sum) {
        int n = arr.length;
        int start = 0, i;
        int currentSum = arr[0];

        for (i=1; i<=n; i++) {
            while (currentSum>sum && start<i - 1) {
                currentSum = currentSum-arr[start];
                start++;
            }

            if (currentSum == sum) {
                System.out.println(start+" and "+ (i-1));
                return 1;
            }

            if (i<n) {
                currentSum = currentSum+arr[i];
            }
        }

        return 0;
    }
}
