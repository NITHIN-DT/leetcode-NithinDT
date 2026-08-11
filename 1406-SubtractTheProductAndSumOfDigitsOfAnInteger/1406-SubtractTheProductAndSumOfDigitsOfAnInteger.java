// Last updated: 11/08/2026, 21:19:42
class Solution {
    public int subtractProductAndSum(int n) {
        int d,d1,s=1,c=0,t;
        t=n;
        while(n!=0)
        {
           d=n%10;
           n=n/10;
           s=s*d;
        }
        while(t!=0)
        {
            d1=t%10;
            t=t/10;
            c=c+d1;
        }
        return s-c;
    }
}