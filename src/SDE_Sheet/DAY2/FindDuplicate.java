package SDE_Sheet.DAY2;

public class FindDuplicate {

    static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,2,4};
        findDuplicate(nums);
    }
}
