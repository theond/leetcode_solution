package basesort;

import java.util.Arrays;

public class QuickSort {

    /*
     * 快速排序：采用了分治的思想，把原始的数组筛选成较小值和较大值的两个子数组，然后递归地排序两个子数组
     *
     * 空间复杂度 O(logn)，时间复杂度 O(nlogn)
     * 对于规模为 n 的问题，一共要进行 log(n) 次的切分，和基准值进行 n-1 次比较;
     *
     * 快速排序在每次递归的过程中，只需要开辟 O(1) 的存储空间来完成操作来实现对数组的修改,
     * 而递归次数为 logn，所以它的整体空间复杂度完全取决于压堆栈的次数
     *
     * 优化：优化基准值的选取，三数取中法，随机法
     */

    public static int[] partition(int[] nums, int low, int high) {
        // nums[high]为基准值
        //分为三段，小于基准值，大于基准值
        int less = low - 1, more = high;
        while (low < more) {
            if (nums[low] < nums[high]) {
                swap(nums, ++less, low++);
            } else if (nums[low] > nums[high]) {
                swap(nums, low, --more);
            } else {
                low++;
            }
        }

        swap(nums, more, high);
        //返回与基准值相等的上下边界
        return new int[]{less + 1, more};
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int[] boundary = partition(nums, low, high);
        quickSort(nums, low, boundary[0] - 1);
        quickSort(nums, boundary[1] + 1, high);
    }

    public static void quickSort(int[] nums) {
        quickSort(nums, 0,nums.length-1);
    }

    public static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] testNums = {16, 3, 7, 1, 9, 8, 2, 4};
        quickSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
