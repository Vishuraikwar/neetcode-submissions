class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        else{
            int maxprofit = 0;
            int buyprice = prices[0];
            for(int i = 1 ; i < prices.length ; i++){
                if(prices[i] < buyprice){
                    buyprice = prices[i];
                }
                else{
                    int sellprice = prices[i];
                    int profit = sellprice - buyprice;

                    if (profit > maxprofit){
                        maxprofit = profit;
                    }
                }
            }
            return maxprofit;
        }
    }
}
