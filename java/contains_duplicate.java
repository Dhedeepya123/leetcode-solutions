// ======================================
// LeetCode Problem: contains duplicate
// Language: java
// Link: https://leetcode.com/problems/contains-duplicate/
// Synced by: LinkCode
// Date: 10/2/2026, 8:11:48 PM
// ======================================


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer>hs= new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);

        }
        boolean output = true;
        if(hs.size() < nums.length){
             output=true;
        }
        else{
            output=false;
        }
        return output;
        
    }
}