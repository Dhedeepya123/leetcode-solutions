// ======================================
// LeetCode Problem: rotate array
// Language: java
// Link: https://leetcode.com/problems/rotate-array/
// Synced by: LinkCode
// Date: 10/6/2026, 11:30:20 PM
// ======================================


class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        int middle = n - k;

        // Reverse first part
        int i = 0;
        int j = middle - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Reverse last k elements
        i = middle;
        j = n - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // Reverse whole array
        i = 0;
        j = n - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}