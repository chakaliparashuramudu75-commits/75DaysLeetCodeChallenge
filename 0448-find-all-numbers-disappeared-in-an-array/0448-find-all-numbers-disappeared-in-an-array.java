class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>mahi=new ArrayList<>();
        Set<Integer>mahi1=new HashSet<>();
        /*for(int i=1;i<=nums.length;i++)
        {
            boolean mahi1=false;
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    mahi1=true;
                    break;
                }
            }
            if(!mahi1) mahi.add(i);
        }
        return mahi;*/
        for(int num:nums) 
        {
            mahi1.add(num);
        }
         for(int i=1;i<=nums.length;i++)
        {
            if(!mahi1.contains(i)) mahi.add(i);
        }
        return mahi;
    }
}