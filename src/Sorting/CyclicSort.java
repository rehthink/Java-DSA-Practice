package Sorting;

import java.util.Arrays;

import static Sorting.SelectionSort.swap;

public class CyclicSort {
    /*
    * Whenever numbers are giving in range [1..N], use cyclic sort
    * */
    public static void main(String[] args) {

        int[] arr =  {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i< arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }
}
