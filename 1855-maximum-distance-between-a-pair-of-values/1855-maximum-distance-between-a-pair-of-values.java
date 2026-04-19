class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0;
        /*for(int i=0;i<nums1.length;i++)
        {
            int s1=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                int s2=nums2[j];
                if(s1<=s2) max=Math.max(j-i,max);
            }
        }
        return max;*/
    int i=0,j=0;
    while(i<nums1.length && j<nums2.length)
    {
        if(nums1[i]<=nums2[j])
        { 
            max=Math.max(j-i,max);
            j++;
        }
        else i++;
    }
        return max;
    }
}