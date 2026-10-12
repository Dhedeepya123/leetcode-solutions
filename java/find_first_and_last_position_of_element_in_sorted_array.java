// ======================================
// LeetCode Problem: find first and last position of element in sorted array
// Language: java
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Synced by: LinkCode
// Date: 10/12/2026, 3:27:39 PM
// ======================================


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first = -1;
int last = -1;

    int left = 0;
    int right = n - 1;

    // Find the first occurrence
    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            first = mid;
            right = mid - 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // Reset boundaries for the second binary search
    left = 0;
    right = n - 1;

    // Find the last occurrence
    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            last = mid;
            left = mid + 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return new int[]{first, last};
}

}