package solution.array;

/**
 * @author theond
 * desc leetcode
 * date 2019-11-14
 **/

public class MaxProfit {

    /*
     * 贪心算法，只管局部最优
     */
    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 1 ;i < prices.length; i++){
            int temp = prices[i] - prices[i-1];
            if(temp > 0){
                max = max + temp;
            }
        }

        return max;
    }
}
