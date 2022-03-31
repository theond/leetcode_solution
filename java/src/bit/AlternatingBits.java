package bit;

/*
 * https://leetcode-cn.com/problems/binary-number-with-alternating-bits/submissions/
 */

public class AlternatingBits {
//    long a = 1431655765L;
//    long b = 2863311530L;
    public boolean hasAlternatingBits(int n) {
        int a = n^(n>>1);
        return (a&(a+1)) == 0;
    }

}
