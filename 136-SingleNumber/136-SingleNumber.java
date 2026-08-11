// Last updated: 11/08/2026, 21:23:40
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
       return x;
        
    }
}