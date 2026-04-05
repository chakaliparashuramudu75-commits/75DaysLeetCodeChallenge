class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       // int n=matrix.length;
        //int m=matrix[0].length;
        //int mahi[]=new int[n*m];//matrix.length*matrix[0].length];
        int i=0;
        for(int row[]:matrix)
        {
            for(int col:row)
            {
                if(col==target) return true;
            }
        }
       // for(int num:mahi)
        //{
          //  if(num==target) return true;
        //}
        return false;
    }
}