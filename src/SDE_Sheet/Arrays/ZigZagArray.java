package SDE_Sheet.Arrays;

import java.util.Arrays;

public class ZigZagArray {

    /*
    * Input: N = 7 , arr[] = {4, 3, 7, 8, 6, 2, 1}
    * Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
    * Explanation: The given array is in zig-zag pattern
    * as we can see 3 < 7 > 4 < 8 > 2 < 6 >1
    * */

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        zigzag(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void zigzag(int[] arr) {
        boolean flag = true;

        int temp = 0;
        for (int i = 0; i< arr.length-2; i++) {
            if (flag) {

                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            } else {

                if (arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            flag = !flag;
        }
    }
}
