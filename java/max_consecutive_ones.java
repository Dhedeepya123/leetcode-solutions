// ======================================
// LeetCode Problem: max consecutive ones
// Language: java
// Link: https://leetcode.com/problems/max-consecutive-ones/
// Synced by: LinkCode
// Date: 10/3/2026, 11:07:00 PM
// ======================================


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(count,max);
            }
            else{
                count=0;
            }
        
        }
        return max;

    }
}