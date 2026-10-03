// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 10/4/2026, 12:00:34 AM
// ======================================


class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
         int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}