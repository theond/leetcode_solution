package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
    /*
     * https://leetcode.com/problems/4sum/
     */

    public List<List<Integer>> fourSum(int[] nums, int target){

        if(nums == null || nums.length < 4){
            return Collections.emptyList();
        }
        int size = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < size -3; i++){
            if(i != 0 && nums[i] == nums[i -1])
                continue;

            int sub = target - nums[i];

            for(int j =i+1;j<size -2; j++){
                if(j != i+1 && nums[j] == nums[j-1])
                    continue;

                int subTarget = sub - nums[j];
                int p = j+1, q=size -1;
                while(p < q){
                    if( p != j+1 && nums[p] == nums[p-1]) {
                        p++;
                        continue;
                    }

                    if(q != size-1 && nums[q] == nums[q+1]) {
                        q--;
                        continue;
                    }

                    if(nums[q] + nums[p] < subTarget) {
                        p++;
                    }else if (nums[p] + nums[q] > subTarget) {
                        q--;
                    }else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                    }
                }
            }
        }
        return result;
    }
}
