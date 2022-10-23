package Sorting;

import java.util.Arrays;

import static Sorting.SelectionSort.swap;

public class MissingNumber {

    /*
    * https://leetcode.com/problems/missing-number/
    * Amazon Questions
    * */

    public static void main(String[] args) {
        int[] arr = {2,1,4,0,3,6};
        int n = missingNumb(arr);
        System.out.println(n);

    }
    public static int missingNumb(int[] arr) {
        int i = 0;
        while (i< arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        for (int index = 0; index< arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }
}
