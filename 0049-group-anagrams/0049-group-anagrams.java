class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mahi=new HashMap<>();
        for(String word:strs)
        {
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!mahi.containsKey(k))
            {
                mahi.put(k,new ArrayList<>());
            }
            mahi.get(k).add(word);
        }
        return new ArrayList<>(mahi.values());
    }
}