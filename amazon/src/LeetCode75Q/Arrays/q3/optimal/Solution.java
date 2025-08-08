package LeetCode75Q.Arrays.q3.optimal;

import java.util.Arrays;

/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104

 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        /*
        prices = [7,1,5,3,6,4]
         */
        int maxProfit = 0;
        int min = prices[0];
        int currentProfit;
        for (int i = 1; i < n; i++) {
            min = Math.min(prices[i], min);
            currentProfit = prices[i]-min;
            maxProfit = Math.max(currentProfit,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        {
            int[] prices = {7,1,5,3,6,4};
            int profit = maxProfit(prices);
            System.out.println("prices= "+ Arrays.toString(prices)+"\nprofit= "+profit);
        }
        {
            int[] prices = {7,6,4,3,1};
            int profit = maxProfit(prices);
            System.out.println("prices= "+ Arrays.toString(prices)+"\nprofit= "+profit);
        }
    }
}
