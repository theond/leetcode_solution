package basesort;

import java.util.Arrays;

public class SelectionSort {
    /*
     * 选择排序: 在无序数组中找到一个最小值，放到有序数组的最右端
     * 空间复杂度 O(1)，时间复杂度 O(n²)，
     * 是一种不稳定的排序算法，因为每次都要找剩余未排序元素中的最小值，并和前面的元素交换位置
     */

//    public static void selectSort(int[] nums){
//        int size = nums.length;
//        for(int i = 0; i < size - 1; i++){
//            for(int j = i+1; j < size; j++){
//                if(nums[i] > nums[j]){
//                    swap(nums, i, j);
//                }
//            }
//        }
//    }

    // 优化版
    public static void selectSort(int[] nums){
        int size = nums.length;
        for(int i = 0; i < size - 1; i++){
            int minIndex = i;
            for(int j = i; j < size; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] testNums = {16, 3, 7, 1, 9, 8, 2, 4};
        selectSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
