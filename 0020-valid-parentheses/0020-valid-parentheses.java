class Solution {
    public boolean isValid(String s) {
        Stack<Character>mahi=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[') 
            {
                mahi.push(ch);
            }
            else 
            {
                if(mahi.isEmpty()) return false;
                char c=mahi.pop();
                if(((c=='(') && ch!=')') || ((c=='{') && ch!='}') ||((c=='[') && ch!=']')) return false;
            }
        }
       return  mahi.isEmpty()?true:false;
    }
}