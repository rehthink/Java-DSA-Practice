package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums =  {22,33,1,3,4,5,6,72,-4};
        int target = 22;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return  -1;
        }

        for (int index = 0; index< arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
