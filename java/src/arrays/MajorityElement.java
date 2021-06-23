package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int count = countMap.getOrDefault(nums[i], 0)+1;
            if(count > nums.length/2)
                return nums[i];
            countMap.put(nums[i], count);
        }
        return -1;
    }
}
