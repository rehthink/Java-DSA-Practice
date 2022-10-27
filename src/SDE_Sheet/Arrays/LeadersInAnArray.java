package SDE_Sheet.Arrays;

import java.util.Stack;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};

        printLeaders(arr);
        System.out.println();
        optimisedPrintLeaders(arr);
        System.out.println();
        stackPrintLeaders(arr);
    }

    static void printLeaders(int[] arr) {
        /*
        * Time Complexity : O(N*N)
        *
        * */

        for (int i = 0; i<arr.length; i++) {
            int j;
            for (j = i+1; j< arr.length; j++) {
                if (arr[i]<= arr[j]) {
                    break;
                }
            }

            if (j == arr.length) {
                System.out.print(arr[i]+ " ");
            }
        }
    }

    static void optimisedPrintLeaders(int[] arr) {
        /*
        *Linear Complexity
        * O(N)
        * **/

        int size = arr.length;
        int max = arr[size-1];
        System.out.print(max + " ");
        for (int j = size-2; j>=0; j--) {
            if (max<arr[j]) {
                max = arr[j];
                System.out.print(max + " ");
            }
        }
    }

    static void stackPrintLeaders(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int size = arr.length;
        stack.push(arr[size-1]);

        for (int i = size-2;i>=0; i--) {
            if (arr[i] >= stack.peek()){
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }

    }
}
