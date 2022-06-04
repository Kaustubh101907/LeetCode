package Arrays;

// Que Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today
        for (int i = 0 ; i < prices.length; i++) {
            if (prices[i] < lsf) { // if we find a new buy value which is smaller than the prev one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, buy - sell
            if (pist > op) {
                op = pist;
            }
        }
        return op;
    }
}
