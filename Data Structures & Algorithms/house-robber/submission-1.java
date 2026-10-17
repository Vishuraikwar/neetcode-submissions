class Solution {

    public int[] dp = new int[101];
    public int solve(int[] nums, int i){
        if(i>=nums.length) return 0;

        if(dp[i] != 0) return dp[i];
        int takef = nums[i] + solve(nums,i+2);
        int takes = solve(nums,i+1);

        return dp[i] = Math.max(takef,takes);
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return solve(nums,0);
    }
}
