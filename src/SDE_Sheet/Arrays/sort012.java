package SDE_Sheet.Arrays;

import java.util.Arrays;

public class sort012 {

    /*
    * https://leetcode.com/problems/sort-colors/
    * */

    public static void main(String[] args) {
        int[] arr = {0,2,2,2,1,0,1};
        letsSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void letsSort(int[] arr) {
        int low = 0;
        int mid = 0;
        int height = arr.length-1;
        int temp;
        while (mid <= height) {
            int x = arr[mid];

            if (x == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (x==1) {
                mid++;
            }else {
                temp = arr[mid];
                arr[mid] = arr[height];
                arr[height] = temp;

                height--;
            }
        }

    }
}
