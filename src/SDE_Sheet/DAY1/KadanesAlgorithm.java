package SDE_Sheet.DAY1;

public class KadanesAlgorithm {
    /*
    * Given an integer array arr, find the contiguous sub-array
    * (containing at least one number) which
    * has the largest sum and returns its sum and prints the sub-array.
    * */

    static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            curSum = Math.max(nums[i], curSum+nums[i] );
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums = {2,1,3,-4,6,8,-1};
        System.out.println(maxSubArray(nums));
    }
}
