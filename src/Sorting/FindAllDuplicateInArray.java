package Sorting;

import java.util.ArrayList;
import java.util.List;

import static Sorting.FindDuplicate.swap;

public class FindAllDuplicateInArray {
    /*
    * https://leetcode.com/problems/find-all-duplicates-in-an-array/
    * */

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();

        while(i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i] != nums[correct] ) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index<nums.length; index++) {
            if(nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

}
