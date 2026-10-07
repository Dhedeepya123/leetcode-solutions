// ======================================
// LeetCode Problem: kids with the greatest number of candies
// Language: java
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Synced by: LinkCode
// Date: 10/7/2026, 11:56:15 PM
// ======================================


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List <Boolean> result=new ArrayList<>();
        for(int i =0;i<n;i++){
            int Sum=candies[i] + extraCandies;
            boolean greatest =true;
            for(int j=0;j<n;j++){
                if(Sum>=candies[j]){
                    greatest=true;
                }
                else{
                    greatest=false;
                    break;
                }
            }
            result.add(greatest);
        }
        return result;

        
    }
}