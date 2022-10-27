package SDE_Sheet.Arrays;

import java.util.Arrays;

class ReplaceElementsWithGreatest {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
        int size = arr.length;
        int max = -1;
        
        for(int i = size-1; i>= 0; i--) {
         
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}