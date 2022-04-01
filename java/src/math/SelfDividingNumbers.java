package math;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode-cn.com/problems/self-dividing-numbers/
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> resultList = new ArrayList<>();
        for(int i = left; i <= right; i++){
            String iStr = Integer.toString(i);
            if(iStr.contains("0"))
                continue;

            int q = i;
            boolean flag = true;
            while(q > 0){
                int r = q%10;
                if(i % r != 0){
                    flag = false;
                    break;
                }
                q /= 10;
            }

            if(flag){
                resultList.add(i);
            }
        }

        return resultList;

    }
    //better performance
    /*
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        if (left > right) return ans;
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumbers(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isSelfDividingNumbers(int num) {
        int x = num;
        while (x > 0) {
            if (x % 10 == 0 || num % (x % 10) != 0) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

     */
}
