package SDE_Sheet.Arrays;

public class KthElementFromTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.print(kth(arr1, arr2, k));
    }

    static int kth(int[] ar1, int[] ar2, int k){
        int n = ar1.length;
        int m = ar2.length;
        int[] sorted = new int[n+m];
        int i=0, j=0, d = 0;

        while (i<m && j<n){
            if (ar1[i]<ar2[j]){
                sorted[d++] = ar1[i++];
            }else {
                sorted[d++] = ar2[j++];
            }
        }


        return sorted[k-1];
    }
}
