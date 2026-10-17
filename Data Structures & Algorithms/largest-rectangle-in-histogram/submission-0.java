class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> right = new Stack<>();
        int[] smallerRt = new int[n];
        Stack<Integer> left = new Stack<>();
        int[] smallerLt = new int[n];


        for(int i = n-1 ; i >= 0 ; i--){
            while(!right.isEmpty() && heights[i] <= heights[right.peek()]){
                right.pop();
            }

            if(right.isEmpty()){
                smallerRt[i] = n;
            }
            else{
                smallerRt[i] = right.peek();
            }
            right.push(i);
        }

        for(int i = 0 ; i < n ; i++){
            while(!left.isEmpty() && heights[i] <= heights[left.peek()]){
                left.pop();
            }
            if(left.isEmpty()){
                smallerLt[i] = -1;
            }
            else{
                smallerLt[i] = left.peek();
            }
            left.push(i);
        }

        int max = Integer.MIN_VALUE; 
        for(int i = 0 ; i < n ; i++){
            int crrAr = heights[i] * (smallerRt[i] - smallerLt[i] -1);
            if(max < crrAr){
                max = crrAr;
            }
        }
        return max ;
    }
}
