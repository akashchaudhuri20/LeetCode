package com.leetcode;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    private static int maxProfit(int[] prices) {
        /*
        1. Update the minimum buying price encountered.
        2. Calculate the potential profit if sold today using that minimum price.
        3. Update the maximum profit accordingly.
        */
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int n : prices){
            minPrice = Math.min(minPrice, n);
            maxProfit = Math.max(maxProfit, n - minPrice);
        }
        return maxProfit;
    }
}
