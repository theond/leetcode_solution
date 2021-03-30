package arrays;

public class ArrayRotate {

    /*
     * https://leetcode.com/problems/rotate-array/
     */

    //使用额外数组
    /*
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] newNums = new int[size];
        for(int i = 0; i < size; i++){
            newNums[(i + k)%size] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, size-1);
    }
     */

    //循环替换
    /*
     * 直接将每个数字放至它最后的位置，这样被放置位置的元素会被覆盖从而丢失,
     * 所以当将i放到(i+k)/size的位置后，需要将(i+k)/size放到(i+2k)/size的位置，
     * 如此循环，遍历整个数组
     */
    /*
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k%size;
        int count = gcd(k,size);
        for(int i = 0; i < count; i++){
            int current = i, prev = nums[i];
            do{
                int next = (current + k)%size;
                int temp  = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            }while(i != current);
        }
    }

    //辗转相除法(更相减损法也可以求最大公约数)
    private int gcd(int x, int y){
        return y > 0? gcd(y, x%y) : x;
    }
     */

    //翻转法
    /*
     * 将数组的元素向右移动 kk 次后，尾部 k mod n 个元素会移动至数组头部，其余元素向后移动 k mod n 个位置
     */
    public void rotate(int[] nums, int k){
        if(nums == null)
            return;

        int size = nums.length;
        k %=size;

        if(size < 2 || k == 0)
            return;

        rotate(nums,0, size-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, size-1);
    }

    private void rotate(int[] nums, int i, int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
