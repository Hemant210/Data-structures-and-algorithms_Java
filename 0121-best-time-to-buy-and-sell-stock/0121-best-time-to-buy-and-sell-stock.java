class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyp = prices[0];
        int n = prices.length;

        for(int i = 1; i < n; i++){
            if(buyp > prices[i]){
                buyp = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyp);
        }

        return profit;
    }
}