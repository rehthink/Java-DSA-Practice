package SDE_Sheet.DAY2;

public class MergeSortedArray {

    /*
    *
    * DAY2
    * https://leetcode.com/problems/merge-sorted-array/description/
    *
    * */


    static int[] merge(int[] nums1, int[] nums2, int m, int n) {
        int pos = m+n-1;
        m--; n--;

        while(n>=0) {
            if (m>=0 && nums1[m]> nums2[n]) {
                nums1[pos--] = nums1[m--];
            }else {
                nums1[pos--] = nums2[n--];
            }
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5};
        int[] nums2 = {4,7,8};

        merge(nums1, nums2, nums1.length, nums2.length);
    }
}
