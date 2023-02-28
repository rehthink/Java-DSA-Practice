package SDE_Sheet.DAY1;

public class NextPermutation {

    static void nextPermutation(int[] num) {
        if (num ==  null || num.length <= 1) return;
        int i = num.length-2;
        while (i>=0 && num[i] >= num[i+1]) i--;
        if (i>=0) {

            int j= num.length-1;
            while (num[j]<=num[i]) j--;
            swap(num, i, j);
        }
        reverse(num, i+1, num.length-1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int i, int j) {
        while (i<j) {
            swap(nums, i++, j--);
        }
    }

    public static void main(String[] args) {
        int[] num = {1,3,2};
    }
}
