package basesort;

import java.util.Arrays;

public class BubbleSort {
    /*
     * 冒泡排序: 相互间两两比较，将大的移动到数组右端
     * 空间复杂度 O(1)、时间复杂度 O(n²)，
     * 是一种稳定的排序算法（稳定是指，两个相等的数，在排序过后，相对位置保持不变）
     */
    public static void bubbleSort(int[] nums) {

        int size = nums.length;
        // swapFlag 用于标识当此遍历是否进行交换，如果没有进行说明已排序完成，无需再进行下次遍历
        boolean swapFlag = true;
        for (int i = 0; (i < size - 1) && swapFlag; i++) {
            swapFlag = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapFlag = true;
                }
            }
        }
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] testNums = {16,3,7,1,9,8,2,4};
        bubbleSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
