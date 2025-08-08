package LeetCode75Q.Arrays.q3.BF;

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
        int n= prices.length;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               /*
               prices = [7,1,5,3,6,4]
                */
               maxProfit = Math.max(prices[j]-prices[i],maxProfit);
            }
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
