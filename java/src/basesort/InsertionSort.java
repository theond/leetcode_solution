package basesort;

import java.util.Arrays;

public class InsertionSort {

    /*
     * 插入排序：向一组有序的数组中插入数据，使数据最终是有序的；
     *
     * 代码实现上，从无序中取一个数作为基准，从大到小搜索有序数组，
     * 将比基准大的数后移一位，遇到比基准小的数，将基准赋值到此位置的后一位
     *
     * 空间复杂度 O(1)，时间复杂度 O(n²)，是一种稳定的排序算法
     */

    public static void insertSort(int[] nums) {

        int size = nums.length;
        for (int i = 1, j; i < size; i++) {
            int num = nums[i];
            for (j = i - 1; j >= 0 && num < nums[j]; j--) {
                    nums[j + 1] = nums[j];
            }
            nums[j + 1] = num;
        }
    }

//    public static void swap(int[] nums, int index1, int index2){
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//    }

    public static void main(String[] args) {
        int[] testNums = {16, 3, 7, 1, 9, 8, 2, 4};
        insertSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
