class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mahi=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
    int ne=target-nums[i];
    if(mahi.containsKey(ne))
    {
        return new int[]{mahi.get(ne),i};
    }
    mahi.put(nums[i],i);
}
return new int[]{};
    }
}