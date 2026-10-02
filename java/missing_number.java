// ======================================
// LeetCode Problem: missing number
// Language: java
// Link: https://leetcode.com/problems/missing-number/
// Synced by: LinkCode
// Date: 10/2/2026, 8:54:56 PM
// ======================================


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Sumofnnumbers;
        if(n%2==0){
            Sumofnnumbers= (n + 1) * (n / 2);
        }
        else{
            Sumofnnumbers= ((n + 1) / 2) * n;
        }
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];

       }
      int result=Sumofnnumbers-sum;
       return result;

        
    }
}