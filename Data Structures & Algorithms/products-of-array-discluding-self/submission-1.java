class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int leftprod = 1;
        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = leftprod;
            leftprod *= nums[i] ;
            
        }

        int rightprod = 1;
        for(int i = ans.length-1 ; i >= 0 ; i--){

            ans[i] *= rightprod;
            rightprod *= nums[i]; 
            
        }

        return ans;
    }
}  
