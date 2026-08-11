// Last updated: 11/08/2026, 21:19:33
class Solution {
    public int[] runningSum(int[] nums) {
        int i,n;
        n=nums.length;
        for(i=1;i<n;i++)
          nums[i]=nums[i]+nums[i-1];
        return nums;        
    }
}