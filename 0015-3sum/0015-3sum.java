class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>mahi=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                 List<Integer>virat=new ArrayList<>();
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0)
                    {
                      virat.add(nums[i]);
                      virat.add(nums[left]);
                      virat.add(nums[right]);
                      mahi.add(virat);
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                    }
                    if(sum<0) left++;
                    else right--;
            }
        }
        return mahi;
    }
}