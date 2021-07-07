package basesort;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int nums[]){
        int length = nums.length;
        for(int gap = length>>1; gap > 0; gap >>= 1){
            for(int i = gap; i < length; i++){
                int temp = nums[i], j;
                for(j = i -gap; j >= 0 && nums[j] > temp; j -= gap){
                    nums[j+gap] = nums[j];
                }
                nums[j+gap] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] testNums = {16, 3, 7, 1, 9, 8, 2, 4};
        shellSort(testNums);
        System.out.println(Arrays.toString(testNums));
    }
}
