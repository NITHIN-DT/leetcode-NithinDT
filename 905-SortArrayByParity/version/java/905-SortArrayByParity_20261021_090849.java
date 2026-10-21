// Last updated: 21/10/2026, 09:08:49
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int i=0,j=nums.length-1;
4        while(i<j){
5            while(i<j && nums[i]%2==0){
6                i++;
7            }
8            while(i<j && nums[j]%2!=0){
9                j--;
10            }
11            int temp=nums[i];
12            nums[i]=nums[j];
13            nums[j]=temp;
14        }
15        return nums;
16    }
17}