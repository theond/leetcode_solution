package solveproblem;

public class RemoveDuplicates {
    /*
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public static int removeDuplicates(int[] nums){
        int count = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i -1])
                count++;
            else
                nums[i -count] = nums[i];
        }
        return nums.length - count;
    }
}
