class Solution {
    public void moveZeroes(int[] nums) {
        int mahi[]=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                mahi[s++]=nums[i];
            }
        }
       /* while(s<nums.length)
        {
            mahi[s++]=0;
        }*/
        for(int i=0;i<nums.length;i++)
        {
             nums[i]=mahi[i];
        }


    }
}