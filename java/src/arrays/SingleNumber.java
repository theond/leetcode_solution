package arrays;

// https://leetcode-cn.com/problems/single-number/
//位操作 异或
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
}
