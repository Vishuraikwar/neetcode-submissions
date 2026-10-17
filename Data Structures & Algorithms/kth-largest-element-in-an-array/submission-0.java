class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < nums.length ; i++){
            pq.add(nums[i]);
        }
        int i = 0;
        int poll = pq.peek();
        while(i<k){
            poll = pq.poll();
            i++;
        }
        return poll;
    }
}
