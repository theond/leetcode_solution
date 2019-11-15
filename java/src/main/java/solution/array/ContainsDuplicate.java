package solution.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * @author theond
 * desc leetcode
 * date 2019-11-15
 **/

public class ContainsDuplicate {

    //暴力遍历
    public static boolean isDuplicate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //hash表
    public boolean isDuplicaeHash(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
