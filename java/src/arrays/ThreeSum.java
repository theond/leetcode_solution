package arrays;

import java.util.*;

public class ThreeSum {
    /*
     * https://leetcode.com/problems/3sum/
     */
    public List<List<Integer>> threeSum(int[] nums){
        int size = nums.length;
        if(nums == null || size < 3)
            return Collections.emptyList();
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < size - 1; i++){
            if( i > 0 && nums[i] == nums[i-1])
                continue;

            int temp = 0 - nums[i];
            int p = i + 1, q = size - 1;
            while(p < q){
                if(p > i+1 && nums[p] == nums[p -1]){
                    p++;
                    continue;
                }
                if(q < size -1 && nums[q] == nums[q+1]){
                    q--;
                    continue;
                }

                if(nums[p] +nums[q] <temp) {
                    p++;
                } else if(nums[p] + nums[q] > temp) {
                    q--;
                } else{
                    result.add(Arrays.asList(nums[p], nums[q], nums[i]));
                    p++;
                    q--;
                }
            }
        }
        return result;
    }
}
