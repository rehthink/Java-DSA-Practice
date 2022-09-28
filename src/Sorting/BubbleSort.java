package Sorting;

import java.util.Arrays;

public class BubbleSort {
    /*
    * Bubble Sort is the simplest sorting algorithm that works by
    * repeatedly swapping the adjacent elements if they are in the
    * wrong order. This algorithm is not suitable for large data
    * sets as its average and worst-case time complexity is quite high.
    *
    * Best Case Time Complexity - O(n) - Sorted
    * Worst Case Time Complexity - O(n^2)
    * aka Sinking Sort/Exchange Sort
    * Space Complexity = O(1) - Constant - No Extra Space required i.e.
    * copying the array, e.t.c not required
    * aka inplace sorting algorithm
    *
    *  */
    public static void main(String[] args) {

        int arr[] = {4,3,5,7,8,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i<arr.length; i++) {

            for (int j = 1; j < arr.length-i; j++) {
                //swap if the element is smaller than previous
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
