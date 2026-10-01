// ======================================
// LeetCode Problem: concatenation of array
// Language: java
// Link: https://leetcode.com/problems/concatenation-of-array/
// Synced by: LinkCode
// Date: 10/1/2026, 1:56:25 PM
// ======================================


class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
        
    }
}