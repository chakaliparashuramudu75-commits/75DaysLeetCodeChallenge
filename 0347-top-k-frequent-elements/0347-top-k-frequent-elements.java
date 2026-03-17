class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mahi=new HashMap<>();
        for(int num:nums)
        {
            mahi.put(num,mahi.getOrDefault(num,0)+1);
        }
        List<Integer>virat=new ArrayList<>(mahi.keySet());
        virat.sort((a,b)->mahi.get(b)-mahi.get(a));
        int c[]=new int[k];
        for(int i=0;i<k;i++) c[i]=virat.get(i);
        return c;
    }
}