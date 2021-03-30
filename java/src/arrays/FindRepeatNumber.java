package arrays;

public class FindRepeatNumber {
    /*
     * 《剑指 Offer（第 2 版）》数组中重复的数字:
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0 ～ n-1 的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字
     * 类似：https://leetcode.com/problems/find-the-duplicate-number/
     */

    public int findRepeatNumber(int[] nums) {
        // 题目限定是0~n-1 的范围，所以可以将数字值放到与值一致下标的位置
        for(int i = 0; i < nums.length; i++){
            while(nums[i] !=  i){
                //调整过程中如果发现有相等值，则说明存在重复数据
                if(nums[i] == nums[nums[i]])
                    return nums[i];
                swap(nums, i, nums[i]);
            }
        }

        return -1;
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
