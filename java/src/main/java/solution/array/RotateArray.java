package solution.array;

/**
 * @author theond
 * desc leetcode
 * date 2019-11-14
 **/

public class RotateArray {

    //暴力遍历
    public static void rotate(int[] nums, int k){
        if(k >= nums.length){
            k = k % nums.length;
        }
        for(int i = 0; i < k; i++){
            int temp = nums[0];
            for(int j = 1; j<nums.length; j++){
                int a = nums[j];
                nums[j] = temp;
                temp = a;
            }
            nums[0] = temp;
        }
    }

    //三次旋转法
    public void fastSelution(int[] nums, int k){
        if(nums == null || k <= 0 || nums.length == 0){
            return;
        }
        int length = nums.length;
        k = k % length;

        //先整体旋转
        handleRotate(nums, 0 , length - 1);
        //再旋转前半部分
        handleRotate(nums, 0 , k - 1);
        //再旋转后半部分
        handleRotate(nums, k, length - 1);

    }
     public void handleRotate(int[] nums, int l, int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
     }
}
