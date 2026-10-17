class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[temperatures.length]; 
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prevday = stack.pop();
                res[prevday] = i-prevday;
            }
            stack.push(i);
        }
        return res;
    }
}
