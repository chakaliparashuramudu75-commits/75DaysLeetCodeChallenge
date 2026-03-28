class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int s1=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                int s3=nums[j];
                if((s1==1&&s3==2) ||(s1==2&&s3==1))
                {
                    int s4=Math.abs(i-j);
                    s=Math.min(s,s4);
                }
            }
        }
        return s==Integer.MAX_VALUE?-1:s;
    }
}