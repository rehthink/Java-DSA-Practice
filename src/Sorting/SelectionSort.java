package Sorting;

import java.util.Arrays;

public class SelectionSort {

    /*
    * The selection sort algorithm sorts an array by repeatedly
    * finding the minimum element (considering ascending order)
    * from the unsorted part and putting it at the beginning.
    * The algorithm maintains two sub-arrays in a given array.
    * The sub-array which already sorted.
    * The remaining sub-array was unsorted.
    * In every iteration of the selection sort,
    * the minimum element (considering ascending order)
    * from the unsorted sub-array is picked and moved to
    * the sorted sub-array.
    * Worst Case : O(n*n)
    * Best Case : O(n*n)
    * */

    public static void main(String[] args) {
        int arr[] = {3,1,2,4,5,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            //find the max item in the remaining array and swap with correct index.
            int last = arr.length-i-1;  //comparison
            int maxIndex = getMaxIndex(arr,0 , last);
            swap(arr, maxIndex, last);
        }

    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i<= last; i++) {
            if (arr[max]<arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
