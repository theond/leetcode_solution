package arrays;

import java.util.Arrays;

public class ThreeSumClosest {
    /*
     * https://leetcode-cn.com/problems/3sum-closest/
     */
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i< nums.length - 2; i++){
            int sub = threeSumClosest(nums, i+1, nums.length-1, target - nums[i]);
            if( Math.abs(sub + nums[i] - target) < diff){
                res = nums[i] + sub;
                diff = Math.abs(sub + nums[i] - target);
            }
        }

        return res;
    }

    public int threeSumClosest(int[] nums, int start, int end, int target){

        int diff = Integer.MAX_VALUE;
        int sub = 0;
        while(start < end){
            int temp = nums[start] + nums[end];
            if(temp == target){
                return target;
            }else{
                if(Math.abs(temp - target)<diff){
                    sub = temp;
                    diff = Math.abs(temp - target);
                }
            }

            if(temp < target)
                start++;
            else
                end--;
        }
            return sub;
    }
}
