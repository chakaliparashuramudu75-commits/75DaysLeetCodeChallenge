class Solution {
    public int maxArea(int[] height) {
        /*int max1=0;
        int left=0,right=heights.length-1;
        while(left<he)*/
        //int max1=0;
        /*for(int i=0;i<height.length;i++)
        {
            //int s1=height[i];
            for(int j=i+1;j<height.length;j++)
            {
                int w=j-i;
                int he=Math.min(height[i],height[j]);
                max1=Math.max(max1,w*he);
            }
        }
        return max1;*/
        int max1=0;
        int left=0,right=height.length-1;
        while(left<right)
        {
         int width=right-left;
         int h=Math.min(height[left],height[right]);   
         max1=Math.max(max1,width*h);
         if(height[left]<height[right]) left++;
         else right--;
        }
        return max1;
    }
}