package solution.array;

/**
 * @author theond
 * desc leetcode
 * date 2019-11-13
 **/

public class RemoveDuplicates {

    /*
     * 双下标遍历
     */
    public static int rmDup(int[] nums){
        int nowSize = nums.length;
        int currentIndex = 0, nextIndex = 1;

        for(; nextIndex <nums.length; nextIndex++){
            if(nums[currentIndex] == nums[nextIndex]){
                nowSize --;
                continue;
            }else{
                nums[currentIndex + 1] = nums[nextIndex];
                currentIndex ++;
            }
        }
        return nowSize;
    }
}
