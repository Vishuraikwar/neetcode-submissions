class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates,target,0 ,new ArrayList<>() , result);
        return result;
    }
    public void backtracking(int[] candidates, int target , int index ,List<Integer> list, List<List<Integer>> result){
        
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target < 0) return;

        for(int i = index ; i < candidates.length ; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            backtracking(candidates , target - candidates[i] , i+1 , list , result);

            list.remove(list.size()-1);
            
        }

    }
}
