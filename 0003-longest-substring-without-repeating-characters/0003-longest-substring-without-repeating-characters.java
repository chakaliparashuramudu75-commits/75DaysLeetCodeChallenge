class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*int max=0,left=0,right=0;
        HashSet<Character> mahi=new HashSet<>();
        while(right<s.length())
        {
            char c=s.charAt(right);
            if(!mahi.contains(c))
            {
                mahi.add(c);
                right++;
                max=Math.max(max,right-left);
            }
            else
            {
                mahi.remove(s.charAt(left));
                left++;
            }
        }
        return max;*/
        boolean[] mahi=new boolean[128];
        int left=0,max=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            while(mahi[ch])
            {
                mahi[s.charAt(left)]=false;
                left++;
            }
            mahi[ch]=true;
            max=Math.max(right-left+1,max);
        }
        return max;
    }
}