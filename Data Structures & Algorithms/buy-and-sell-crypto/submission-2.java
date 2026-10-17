class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int sz = prices.length;
        int buy = prices[0];
        if(sz<2) return 0;
        for(int i = 1 ; i < sz ; i++){
            int sell = prices[i];
            if(sell>buy){
               int profit = sell-buy;
            if(profit>ans) ans = profit; 
            }
            else buy = sell;
        }
        return ans;
    }
}
