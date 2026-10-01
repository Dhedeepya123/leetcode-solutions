// ======================================
// LeetCode Problem: running sum of 1d array
// Language: java
// Link: https://leetcode.com/problems/running-sum-of-1d-array/
// Synced by: LinkCode
// Date: 10/1/2026, 2:08:50 PM
// ======================================


class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int []runningSum=new int[n];
        runningSum[0]=nums[0];
        int   prefixSum=nums[0];
        for(int i=1;i<n;i++){
            runningSum[i]=prefixSum+nums[i];
            prefixSum=runningSum[i];
        }
        return runningSum;

        
    }
}