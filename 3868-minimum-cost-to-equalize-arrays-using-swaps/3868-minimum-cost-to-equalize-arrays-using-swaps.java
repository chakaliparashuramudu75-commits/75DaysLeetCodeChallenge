class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        Map<Integer,Integer>mahi=new HashMap<>();
        Map<Integer,Integer>virat=new HashMap<>();
        Map<Integer,Integer>tot=new HashMap<>();
        for(int num:nums1)
        {
        mahi.put(num,mahi.getOrDefault(num,0)+1);
        tot.put(num,tot.getOrDefault(num,0)+1);
        }
        for(int num:nums2)
        {
            virat.put(num,virat.getOrDefault(num,0)+1);
            tot.put(num,tot.getOrDefault(num,0)+1);
        }
        int cost=0;
        for(int c:tot.keySet())
        {
            int s2=tot.get(c);
            if(s2%2!=0) return -1;
            int t=s2/2;
            int s=mahi.getOrDefault(c,0);
            if(s>t) cost+=s-t;
        }
        return cost;
    }
}
