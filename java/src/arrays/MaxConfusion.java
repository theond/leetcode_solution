package arrays;

/*
 * https://leetcode-cn.com/problems/maximize-the-confusion-of-an-exam/
 * 滑动窗口，此题的将中间不同字符做了处理，思维上先将小于等于k的不同字符视为相同字符，求取最长字串；
 * 当不同字符超过k则左窗口向有移动，往下遍历寻找更大字串
 * 滑动窗口其实是双指针的另一种称呼（个人感觉）
 */

public class MaxConfusion {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxSub(answerKey,k,'T'), maxSub(answerKey,k,'F'));
    }

    public int maxSub(String ansKey, int k, char ch){
        int ans = 0, sum = 0;
        int length = ansKey.length();
        for(int left = 0, right = 0; right < length; right++){
            sum += ansKey.charAt(right)==ch?0:1;
            while(sum > k){
                sum -= ansKey.charAt(left)==ch?0:1;
                left++;
            }
            ans = Math.max(ans, right - left +1);
        }

        return ans;
    }

    /* better performance
    class Solution {
    public int maxConsecutiveAnswers(String Key, int k) {
        char[] c = Key.toCharArray();
        int left = 0,right = 0,max = 0,T = 0,F = 0;
        while(right<c.length){
            if(c[right++] == 'T'){T++;}else{F++;}
            while(T>k&&F>k){
                if(c[left++] == 'T'){T--;}else{F--;}
            }
            max = Math.max(max,(right - left));
        }
        return max;
    }
}

     */
}
