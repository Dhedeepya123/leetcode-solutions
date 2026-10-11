// ======================================
// LeetCode Problem: search in rotated sorted array
// Language: java
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Synced by: LinkCode
// Date: 10/11/2026, 11:18:08 PM
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
            }if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }

            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
        
    }
}