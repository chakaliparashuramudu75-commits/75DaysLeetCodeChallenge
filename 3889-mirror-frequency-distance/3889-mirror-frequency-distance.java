class Solution {
    public int mirrorFrequency(String s) {
       // HashMap<Integer,Intger>mahi=new HashMap<>();
        HashMap<Character,Integer>virat=new HashMap<>();
        int ans=0;
        for(char ch:s.toCharArray())
        {
            virat.put(ch,virat.getOrDefault(ch,0)+1);
        }
        HashSet<Character>mahi=new HashSet<>();
        for(char ch:s.toCharArray())
        {
            if(mahi.contains(ch)) continue;
            int s1=0,s2=0;
            if(ch>='a'&& ch<='z')
            {
                char t=(char)('z'-(ch-'a'));
                mahi.add(ch);
                mahi.add(t);
                if(virat.containsKey(ch))   s1=virat.get(ch);
                if(virat.containsKey(t))    s2=virat.getOrDefault(t,0);
                ans+=Math.abs(s1-s2);
            }
            else if(ch>='0' && ch<='9')
            {
                char r=(char)('9'-(ch-'0'));
                mahi.add(ch);
                mahi.add(r);
                if(virat.containsKey(ch))   s1=virat.get(ch);
                if(virat.containsKey(r))    s2=virat.getOrDefault(r,0);
                ans+=Math.abs(s1-s2);
            }
        }
        return ans;
    }
}