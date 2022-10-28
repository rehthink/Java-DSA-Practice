package SDE_Sheet.Arrays;

import java.util.Arrays;

public class ReverseArrayInGroup {

    /*
    * Given array arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
    * and k = 3
    *
    * Output:
    * { 3, 2, 1, 6, 5, 4, 8, 7 }
    *
    * Complexity : 0(N)
    *
    * */

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 6, 5, 4, 8, 7};
        reverse(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int k) {
        int size = arr.length;
        for (int i = 0; i<size; i+=k) {
            int left = i;
            int right = Math.min(i+k-1, size-1);
            int temp;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left+=1;
                right-=1;
            }
        }
    }

}
