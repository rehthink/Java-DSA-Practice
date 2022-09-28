package Searching;

public class Ceiling {
    public static void main(String[] args) {

        /*
        * arr = [2,3,4,5,7,14,16,18]
        * Ceiling = Smallest element in array greater or = target
        * ceiling(arr, 14) = 14
        * ceiling(arr, 15) = 16
        * Floor = Greatest element in array less or = target
        *
        * **/

        int[] ar = {2,3,4,5,7,14,16,18};
        int target = 15;
        int ceil = findCeiling(ar, target);
        int floor = findFloor(ar, target);

        System.out.println("Ceiling out of given sorted Array: " + ceil);
        System.out.println("Floor out of given sorted Array: " + floor);

    }
    static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target<arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int findFloor(int[] arr, int target) {

        int start = 0;
        int end =  arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
