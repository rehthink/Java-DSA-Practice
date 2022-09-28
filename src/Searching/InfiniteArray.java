package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int ar[] = {2,4,5,6,12,22,23,25};
        int target = 6;
        System.out.println(ans(ar, target));
    }
    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target> arr[end]) {
            int temp = end+1;
            end = end + (end - start + 1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                end = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
