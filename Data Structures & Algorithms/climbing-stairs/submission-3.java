class Solution {

    public int[] dp = new int[10000];

    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return dp[1] = 1;
        if(n == 2) return dp[2] = 2;
        
        if(dp[n] != 0) return dp[n];
        int take1 = climbStairs(n-1);
        int take2 = climbStairs(n-2);

        return dp[n] = take1+take2;
    }
}
