class Solution {

    public int[] dp = new int[101]; 
    public int solve(int[] cost , int n){
        if(n <= 1) return 0;

        if(dp[n] != 0) return dp[n];
        int take1 = cost[n-1] + solve(cost,n-1);
        int take2 = cost[n-2] + solve(cost,n-2);

        return dp[n] = Math.min(take1,take2);
    }
    public int minCostClimbingStairs(int[] cost) {
        return solve(cost,cost.length);
    }
}
