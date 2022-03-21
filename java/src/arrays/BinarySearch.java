package arrays;

public class BinarySearch {
    /*
     * 二分搜索: 对于有序数组进行取中间位置查找
     */

    //循环版
    public static int search(int[] nums, int value) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == value) {
                return mid;
            } else if (nums[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    //递归版
    public static int searchRecursive(int[] nums, int value) {
        return searchRecursive(nums, 0, nums.length - 1, value);
    }

    public static int searchRecursive(int[] nums, int low, int high, int value) {
        if (low >= high) {
            return -1;
        }
        int mid = low + ((high - low) >> 1);
        if (nums[mid] == value) {
            return mid;
        } else if (nums[mid] < value) {
            return searchRecursive(nums, mid + 1, high, value);
        } else {
            return searchRecursive(nums, low, mid - 1, value);
        }
    }

    //存在重复值，查找第一个
    public static int searchFirst(int[] nums, int value){
        int low = 0, high = nums.length -1;
        while(low < high){
            int mid = low + ((high - low) >> 1);
            if(nums[mid] < value){
                low = mid + 1;
            }else if(nums[mid] > value){
                high = mid - 1;
            }else{
                if(mid == 0 || nums[mid -1] != value){
                    return mid;
                }

                high = mid - 1;
            }
        }
        return -1;
    }

    //存在重复值，查找最后一个
    public static int searchLast(int[] nums, int value){
        int low =0, high = nums.length -1;
        while(low < high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] < value){
                low = mid +1;
            }else if(nums[mid] > value){
                high = mid -1;
            }else{
                if(mid == nums.length -1 || nums[mid + 1] != value){
                    return mid;
                }
                low = mid +1;
            }
        }
        return -1;
    }

    //第一个大于
    public static int searchFirstBigger(int[] nums, int value){
        int low = 0, high = nums.length -1;
        while(low < high){
            int mid = low + ((high - low) >> 1);
            if(nums[mid] < value){
                low = mid + 1;
            }else{
                if(mid == 0 || nums[mid -1] < value){
                    return mid;
                }

                high = mid - 1;
            }
        }
        return -1;
    }

    //最后一个小于
    public static int searchLastLess(int[] nums, int value){
        int low =0, high = nums.length -1;
        while(low < high){
            int mid = low + ((high - low)>>1);
            if(nums[mid] > value){
                high = mid -1;
            }else{
                if(mid == nums.length -1 || nums[mid + 1] > value){
                    return mid;
                }
                low = mid +1;
            }
        }
        return -1;
    }
}
