class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> l = new ArrayList<>();
        backTracking(nums,0,l,list);
        return list;
    }
    public void backTracking (int[] nums , int i  ,List<Integer> l,List<List<Integer>> list){
        
        if(i == nums.length){
            list.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[i]);
        backTracking(nums,i+1,l,list);

        l.remove(l.size()-1);
        backTracking(nums,i+1,l,list);

    }
}
