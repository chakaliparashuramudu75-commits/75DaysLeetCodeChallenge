class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>mahi=new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+"))
            {
                mahi.push(mahi.pop()+mahi.pop());
            }
            else if(s.equals("-"))
            {
                int a=mahi.pop();
                int b=mahi.pop();
                mahi.push(b-a);
            }
            else if(s.equals("*"))
            {
                mahi.push(mahi.pop()*mahi.pop());
            }
            else if(s.equals("/"))
            {
                int a=mahi.pop();
                int b=mahi.pop();
                mahi.push(b/a);
            }
            else
            {
                mahi.push(Integer.parseInt(s));
            }
        }
                    return mahi.pop();
    }
}