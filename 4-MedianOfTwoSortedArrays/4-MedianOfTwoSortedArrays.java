// Last updated: 11/08/2026, 21:25:05
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] a=new int[m+n];
        for(int i=0;i<nums1.length;i++)
        a[i]=nums1[i];
        for(int i=0;i<nums2.length;i++)
        a[nums1.length+i]=nums2[i];
        Arrays.sort(a);
        int l=a.length;
        double b=0;
        for(int i=0;i<l;i++){
            if(l%2==0){
                if(i==l/2){
                    b+=a[i];
                    b=b/2.0;
                }
                else if(i==(l/2)-1){
                    b+=a[i];
                }
        }else{
            if(i==l/2)
                b+=a[i];
        }
        }
        return b;
    }
}