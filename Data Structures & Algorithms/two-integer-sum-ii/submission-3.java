class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 ;
        int j = numbers.length-1;
        int[] ans = new int[2];

        while(i<j){

            int currSum = numbers[i]+numbers[j];

            if(currSum == target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }

            else if(currSum > target){
                j--;
            }

            else{
                i++;
            }

        }

        return ans;
    }
}
