// ======================================
// LeetCode Problem: find minimum in rotated sorted array ii
// Language: java
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// Synced by: LinkCode
// Date: 10/14/2026, 11:29:48 PM
// ======================================


class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[0];
        
    }
}