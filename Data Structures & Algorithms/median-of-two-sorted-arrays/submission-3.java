class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // Ensure nums1 is smaller
        if (n > m) return findMedianSortedArrays(nums2, nums1);

        int total = n + m;
        int leftSize = (total + 1) / 2;

        int l = 0, r = n;

        while (l <= r) {
            int mid1 = l + (r - l) / 2;
            int mid2 = leftSize - mid1;

            int leftNums1  = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
            int rightNums1 = (mid1 < n) ? nums1[mid1]     : Integer.MAX_VALUE;

            int leftNums2  = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
            int rightNums2 = (mid2 < m) ? nums2[mid2]     : Integer.MAX_VALUE;

            if (leftNums1 <= rightNums2 && leftNums2 <= rightNums1) {
                if (total % 2 == 0) {
                    return (Math.max(leftNums1, leftNums2) +
                            Math.min(rightNums1, rightNums2)) / 2.0;
                } else {
                    return Math.max(leftNums1, leftNums2);
                }
            } 
            else if (leftNums1 > rightNums2) {
                r = mid1 - 1;
            } 
            else {
                l = mid1 + 1;
            }
        }
        return 0.0;
    }
}
