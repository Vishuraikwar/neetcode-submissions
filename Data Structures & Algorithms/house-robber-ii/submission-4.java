class Solution {
    public int[] dp = new int[101];

    public int solve(int[] nums, int i , int end){
        if(i > end) return 0;
        
        if(dp[i] != 0) return dp[i];

        int take = nums[i] + solve(nums,i+2,end);
        int skip = solve(nums,i+1,end);

        return dp[i] = Math.max(take,skip); 
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        
        int case1 = solve(nums,0,n-2);
        Arrays.fill(dp,0);
        int case2 = solve(nums,1,n-1);
        return Math.max(case1,case2);
    }
}
