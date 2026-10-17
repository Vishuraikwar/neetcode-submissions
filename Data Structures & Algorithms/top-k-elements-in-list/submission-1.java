class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freQ = new HashMap<>();
        for(int num : nums){
            freQ.put(num,freQ.getOrDefault(num,0)+1);
        }
        // 
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : freQ.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);
        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
