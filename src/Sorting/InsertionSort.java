package Sorting;

import java.util.Arrays;

public class InsertionSort {

    /*
    * Insertion sort is a simple sorting algorithm that works
    * similar to the way you sort playing cards in your hands.
    * The array is virtually split into a sorted and an unsorted
    * part. Values from the unsorted part are picked and placed
    * at the correct position in the sorted part.
    *
    * Worst Case - O(n*n)
    * Best Case - O(n)
    *
    * Why to use Insertion sort?
    * Adaptive: steps get reduced if array is sorted
    * Stable
    * Used for smaller values of N
    *
    *
     * */
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,5,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
