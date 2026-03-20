class Solution {
    public int removeDuplicates(int[] nums) {
        //if (nums.length == 0) return 0;
        int k = 1; 
       /* for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) 
            {  
                nums[k] = nums[i];        
                k++;
            }
        }
        return k;*/
        int left=0,right=nums.length-1;
      /*  while(left<right)
        {
            if(nums[left]!=nums[right]) k++;
            left++;
            right--;
        }
        return k;*/
        HashSet<Integer>mahi=new HashSet<>();
        for(int num:nums) mahi.add(num);
        int j=0;
       for(int val:mahi) nums[j++]=val;
        return mahi.size();
    }
}
