package Searching;

public class BinarySearch {

    /*
    * If Array is sorted then always apply Binary Search
    **/

    public static void main(String[] args) {

        int[] nums = {2,4,7,13,23,28,48};
        int target = 13;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                end = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}