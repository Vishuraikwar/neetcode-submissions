class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean> checkDuplicate = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(!checkDuplicate.containsKey(nums[i])){
                checkDuplicate.put(nums[i],true);
            }
            else{
                return true;
            }
            
        }
        return false;
    }
}
