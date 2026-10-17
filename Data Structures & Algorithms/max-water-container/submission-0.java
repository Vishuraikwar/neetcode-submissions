class Solution {
    public int maxArea(int[] heights) {
        int ans = Integer.MIN_VALUE;
        int i = 0 ;
        int j = heights.length-1;

        while(i<j){
            int currAns = (j-i) * Math.min(heights[i],heights[j]);
            if(ans<currAns) ans=currAns;
            else if(heights[i]<heights[j]) i++;
            else j--;
            
        }
        return ans;
    }
}
