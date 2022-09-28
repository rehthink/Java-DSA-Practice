package Searching;

public class PeakIndexInMountainArray {

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/

    public static void main(String[] args) {
        int[] nums  = {2,3,4,5,6,8,9,11,10,7};
        System.out.println(peakIndexInMountainArray(nums));

    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end -  start) / 2;
            if(arr[mid] > arr[mid+1]) {
                //descreasing part of an Array
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
