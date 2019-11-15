package solution.array;

/**
 * @author theond
 * desc leetcode
 * date 2019-11-15
 **/

public class SingleNumber {

    //异或运算
    public static int singleNumber(int[] nums){
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            result = result ^ nums[i];
        }

        return result;
    }
}
