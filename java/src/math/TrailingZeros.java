package math;

public class TrailingZeros {
    /* https://leetcode-cn.com/problems/factorial-trailing-zeroes/
     * 一开始就想到了算5和2的配对数就可以知道，但是还是没有想到具体算法
     * 有思路但是还想不到具体解法的时候，还是需要动手用纸笔缕一缕，找找规律，从简单的几个例子入手
     */
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n > 0) {
            ans += n / 5;
            n = n / 5;
        }
        return ans;
    }
}
