class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer>mahi=new ArrayList<>();
        int n=nums.length;
        int pre[]=new int[n];
        pre[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            pre[i]=Math.max(nums[i],pre[i+1]);
        }
        int suf[]=new int[n];
        suf[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            suf[i]=Math.max(nums[i],suf[i-1]);
        }
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1) mahi.add(nums[i]);
            else if(nums[i]>pre[i+1] || nums[i]>suf[i-1]) mahi.add(nums[i]);
        }
        return mahi;
    }
}