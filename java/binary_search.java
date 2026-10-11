// ======================================
// LeetCode Problem: binary search
// Language: java
// Link: https://leetcode.com/problems/binary-search/
// Synced by: LinkCode
// Date: 10/11/2026, 10:24:49 PM
// ======================================


class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int left=0;
        int right=n-1;
        while(left<=right){
           int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
        
    }
}