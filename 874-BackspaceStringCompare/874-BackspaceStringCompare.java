// Last updated: 11/08/2026, 21:20:22
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tst=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!st.isEmpty())
                    st.pop();
            }
            else{
                st.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!tst.isEmpty())
                    tst.pop();
            }
            else{
                tst.push(ch);
            }
        }
        if(st.equals(tst))
            return true;
        else
            return false;
 }
}
