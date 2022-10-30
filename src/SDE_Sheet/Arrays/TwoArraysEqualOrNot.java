package SDE_Sheet.Arrays;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };

        if (twoArrays(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    static boolean twoArrays(int[] ar1, int[] ar2){
        int n = ar1.length;
        int m = ar2.length;
        if (n != m){
            return false;
        }

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for (int i = 0; i<n; i++){
            if (ar1[i] != ar2[i]){
                return false;
            }
        }
        return true;
    }
}
