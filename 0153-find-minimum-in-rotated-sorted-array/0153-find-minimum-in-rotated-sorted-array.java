class Solution {
    public int findMin(int[] nums) {
        int res=Integer.MAX_VALUE;
        int low=0,high=nums.length-1;
        //int mid=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
                res=Math.min(nums[low],res);
                low=mid+1;
            }
            else
            {
                res=Math.min(nums[mid],res);
                high=mid-1;
                //res=Math.min(nums[low],nums[mid]);
            }
        }
        return res;
          }
}