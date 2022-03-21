package arrays;


/**
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class RotatedFindMin {
    public int findMin(int[] nums){

        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];

        int min = Integer.MAX_VALUE;
        int high = nums.length -1, low = 0;
        while(low <= high) {
            int index = low + (high - low) / 2;
            if (nums[index] < min) {
                min = nums[index];
            }
            if (nums[index] > nums[high]) {
                low = index+1;
            } else {
                high = index-1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        RotatedFindMin solution = new RotatedFindMin();
        int[] nums = {4,5,6,7,0,1,2};
        int result = solution.findMin(nums);
        System.out.println(result);
    }
}
