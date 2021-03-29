package basesort;

import java.util.Arrays;

public class MergeSort {
    /*
     * 归并排序：将数组分解为小问题，再将小问题的解合并成原问题的解；
     * 用递归的方式将数组元素分解为单个元素，让后将元素两两合并，合成小集合后再往上两两合并；
     *
     * 空间复杂度 O(n)，时间复杂度 O(nlogn)，稳定的排序
     * 对于规模为 n 的问题，一共要进行 log(n) 次的切分，每一层的合并复杂度都是 O(n)
     * 合并 n 个元素需要分配一个大小为 n 的额外数组
     */
    public static void merge(int[] nums, int low, int mid, int high, int[] temp) {
        int i = low, j = mid + 1, k = low;
        while (k <= high) {
            if (i > mid) {
                temp[k++] = nums[j++];
            } else if (j > high) {
                temp[k++] = nums[i++];
            } else if (nums[i] > nums[j]) {
                temp[k++] = nums[j++];
            } else if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            }
        }

        System.arraycopy(temp, low, nums, low, high - low + 1);
    }

    public static void mergeSort(int[] nums, int low, int high, int[] temp){
        if(low >= high){
            return;
        }
        // 不用high + low 防止越界
        int mid = low + ((high - low) >> 1);
        mergeSort(nums, low, mid, temp);
        mergeSort(nums, mid + 1, high, temp);
        merge(nums, low, mid, high, temp);
    }

    public static void mergeSort(int[] nums){
        int n = nums.length;
        int[] temp = new int[n];
        mergeSort(nums, 0, n-1, temp);
    }

    public static void main(String[] args) {
        int[] testNums = {16, 3, 7, 1, 9, 8, 2, 4};
        mergeSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
