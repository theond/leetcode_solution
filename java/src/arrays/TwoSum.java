package arrays;

import java.util.HashMap;

public class TwoSum {
    /*
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> result= new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target- nums[i];
            if(result.containsKey(temp))
                return new int[]{i, result.get(temp)};

            result.put(nums[i], i);
        }
        return null;
    }
}
