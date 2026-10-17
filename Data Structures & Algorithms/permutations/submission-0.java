class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> NUMS = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            NUMS.add(nums[i]);
        }
        backtracking(NUMS,new ArrayList<>(),ans);
        return ans;
    }
    public void backtracking(List<Integer> NUMS, List<Integer> list ,List<List<Integer>> ans){
        if(NUMS.isEmpty()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ; i < NUMS.size() ; i++){
            int curr = NUMS.get(i);
            list.add(curr);
            List<Integer> newNUMS = new ArrayList(NUMS);
            newNUMS.remove(i);
            backtracking(newNUMS,list,ans);
            list.remove(list.size()-1);
        }
    }
}
