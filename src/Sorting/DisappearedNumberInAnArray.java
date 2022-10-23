package Sorting;

import java.util.ArrayList;
import java.util.List;

import static Sorting.InsertionSort.swap;

public class DisappearedNumberInAnArray {

    /*
    *https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    * */

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i< nums.length) {
            int check = nums[i]-1;
            if (nums[i] != nums[check]) {
                swap(nums, i, check);
            } else {
                i++;
            }
        }

        //Missing Number
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index<nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }
}
