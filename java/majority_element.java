// ======================================
// LeetCode Problem: majority element
// Language: java
// Link: https://leetcode.com/problems/majority-element/
// Synced by: LinkCode
// Date: 10/9/2026, 12:14:51 AM
// ======================================


class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
       
            HashMap<Integer,Integer>hp= new HashMap<>();
             for(int x:nums){
                hp.put(x,hp.getOrDefault(x,0)+1);
                if(hp.get(x)>n/2){
                    return x;
                }
             }
             return -1;
             
            
        
    }    
    
}