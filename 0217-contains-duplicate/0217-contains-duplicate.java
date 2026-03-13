class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>mahi=new HashSet<>();
        for(int num:nums)
        {
            if(mahi.contains(num)) return true;
            mahi.add(num);
        }
        return false;

    }
}