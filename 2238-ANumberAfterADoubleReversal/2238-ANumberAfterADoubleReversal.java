// Last updated: 11/08/2026, 21:19:08
class Solution {
    public boolean isSameAfterReversals(int num) {
        int t,d,a=0,a1=0,t1;
        t=num;
        while(num!=0){
            d=num%10;
            num=num/10;
            a=(a*10)+d;
        }
        t1=a;
        while(a!=0){
            d=a%10;
            a=a/10;
            a1=(a1*10)+d;
        }
        if(a1==t)
          return true;
        else
          return false;
    }
}