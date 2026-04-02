class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>mahi=new Stack<>();
        int n=temperatures.length;
        int virat[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!mahi.isEmpty() && temperatures[i]>=temperatures[mahi.peek()])
            {
                mahi.pop();
            }
            virat[i]=mahi.isEmpty()?0:mahi.peek()-i;
            mahi.push(i);
        }
        return virat;
    }
}