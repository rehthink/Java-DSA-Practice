package SDE_Sheet.Arrays;

public class EquilibriumPoint {
    /*
    * Given an array A of n positive numbers.
    * The task is to find the first Equilibrium
    * Point in the array. Equilibrium Point in
    * an array is a position such that the sum
    * of elements before it is equal to the sum
    * of elements after it.
    *
    *Input:
    *n = 5
    *A[] = {1,3,5,2,2}
    *Output: 3
    *
    * */

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int ans = equilibriumPoint(arr);
        System.out.println(ans);
    }

    static int sum(int[] arr, int start, int end) {
        int result = 0;
        for (int i = start; i<end; i++){
            result += arr[i];
        }

        return result;
    }

    public static int equilibriumPoint(int[] arr) {
        int size = arr.length;
        int index = size/2;

        int left_sum = sum(arr, 0, index);
        int right_sum = sum(arr, index+1, size);

        if (left_sum == right_sum) {
            return arr[index];
        } else if (left_sum>right_sum) {
            while (index >= 0 ) {
                left_sum -= arr[index-1];
                right_sum += arr[index];
                index -= 1;

                if (right_sum>left_sum) {
                    return -1;
                } else if (right_sum == left_sum) {
                    return arr[index];
                }
            }
        }else if (right_sum>left_sum) {
            while (index <= size-1) {
                right_sum -= arr[index + 1];
                left_sum += arr[index];
                index += 1;

                if (left_sum>right_sum) {
                    return -1;
                } else if (right_sum == left_sum) {
                    return arr[index];
                }
            }
        }
        return -1;
    }
}
