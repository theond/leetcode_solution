package arrays;

import java.util.Arrays;

public class ThreeSumLess {
    /*
     * https://leetcode-cn.com/problems/3sum-smaller/
     */

    public int threeSumSmaller(int[] nums, int target) {
        if(nums == null || nums.length < 3)
            return 0;

        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i< nums.length -2;i++){
            count += threeSumSmaller(nums, i+1, nums.length-1, target - nums[i]);
        }
        return count;
    }

    private int threeSumSmaller(int[] nums, int start, int end, int target){
        int count = 0;

        while(start < end) {
            if (nums[start] + nums[end] < target) {
                count += (end - start);
                start++;
            } else {
                end --;
            }
        }
        return count;
    }

    //递归
    /*
    private int threeSumSmaller(int[] nums, int start, int end, int target){
        if (start >= end)
            return 0;

        int count = 0;

        if(nums[start] + nums[end] < target){
            count += (end - start);
            count += threeSumSmaller(nums, ++start, end, target);
        }else{
            count += threeSumSmaller(nums, start, --end, target);
        }

        return count;
    }

     */
}
