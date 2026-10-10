// ======================================
// LeetCode Problem: find all duplicates in an array
// Language: java
// Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Synced by: LinkCode
// Date: 10/10/2026, 11:55:37 PM
// ======================================


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
         List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}
        

