class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }
        
        while(pq.size()>1){
            int last = pq.poll();
            int secLast = pq.poll();
            if(last == secLast) continue;
            last -= secLast;
            pq.offer(last);
        }
        return (pq.size()==1)?pq.poll():0;
    }
}
