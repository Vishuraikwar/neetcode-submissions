class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] twoSum = new int[2];
        for(int i = 0 ; i <nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                twoSum[0] = map.get(complement); 
                twoSum[1] = i;
            }
            map.put(nums[i],i);
        }
        return twoSum;
    }
}
