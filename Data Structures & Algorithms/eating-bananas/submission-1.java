class Solution {
    public boolean canEatAll(int[] piles, int mid , int h) {
        int ActualHour = 0;
        for(int x : piles){
            ActualHour += (x + mid-1)/mid;
        }
        return ActualHour <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
    int start = 1;
    int end = 0;

    for(int x : piles){
        end = Math.max(end , x);
    }
    while(start < end){
        int mid = start + (end-start)/2;

        if(canEatAll(piles , mid , h)){
            end = mid;
        }
        else{
            start = mid + 1;
        }
    }
    return start;
    }
}
