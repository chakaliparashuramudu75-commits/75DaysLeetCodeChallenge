class Solution {
    public int characterReplacement(String s, int k) {
        int mahi[]=new int[26];
        int maxl=0,maxc=0,left=0;
        for(int right=0;right<s.length();right++)
        {
            int c1=s.charAt(right)-'A';
            mahi[c1]++;
            maxc=Math.max(mahi[c1],maxc);
            while(((right-left+1)-maxc)>k)
            {
                mahi[s.charAt(left)-'A']--;
                left++;
            }
            maxl=Math.max(right-left+1,maxl);
        }
        return maxl;
    }
}