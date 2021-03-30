package arrays;

public class MoveZeroes {
    /*
     * https://leetcode.com/problems/move-zeroes/
     */
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int count = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0){
                count++;
            }else{
                nums[i - count] = nums[i];
            }
        }
         for(int j = size - 1; j >= size - count; j--){
             nums[j] = 0;
         }
    }
}
