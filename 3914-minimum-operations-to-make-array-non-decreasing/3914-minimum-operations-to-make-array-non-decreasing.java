class Solution {
    public long minOperations(int[] nums) {
        long  s=0;
        for(int i=0;i<nums.length-1;i++)
        {
         if(nums[i]>nums[i+1])
            {
         s+=nums[i]-nums[i+1];  
            }
        }
        return s;
}
}