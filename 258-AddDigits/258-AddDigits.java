// Last updated: 11/08/2026, 21:21:57
class Solution {
    public int addDigits(int num) {
        int n,d,sum;
        while(num>=10){
            sum=0;
            while(num!=0){
                d=num%10;
                sum=sum+d;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}