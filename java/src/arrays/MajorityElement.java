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

    // Boyer–Moore vote 算法，适用于超过半数的众数
    public int majority2(int[] nums) {
        int majority = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
                count++;
            }else{
                count +=(majority == nums[i] ? 1 : -1);
            }
        }
        return majority;
    }
}
