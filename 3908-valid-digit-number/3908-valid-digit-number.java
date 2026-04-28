class Solution {
    public boolean validDigit(int n, int x) {
        boolean mahi=false;
        int c1=0;
        int temp=n;
        while(temp!=0)
        {
            int s1=temp%10;
            if(s1==x) mahi=true;
            c1=s1*10+c1;
            temp/=10;
        }
        int firs=n;
        while(firs>=10) firs/=10;
        return mahi&&firs!=x;
    }
}