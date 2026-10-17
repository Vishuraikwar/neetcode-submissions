class Solution {
    public int search(int[] nums, int target) {
        int ans = binary(nums,target,0,nums.length-1);
        return ans;
    }
    public int binary(int[] nums ,int target, int start, int end){
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid; // Target found
        } else if(target > nums[mid]){
            return binary(nums,target,mid+1,end);
        }
        else {
            return binary(nums,target,0,mid-1);
        }
        
    }
}
