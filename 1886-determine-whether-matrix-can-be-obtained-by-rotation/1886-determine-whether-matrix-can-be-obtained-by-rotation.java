class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int c=0;
        while(c<4)
        {
            boolean mahi=true;
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    if(mat[i][j]!=target[i][j])
                    {
                    mahi=false;
                    break;
                    }
                }
            }
            if(mahi) return true;
            int n[][]=new int[mat.length][mat[0].length];
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    n[j][mat.length-1-i]=mat[i][j];
                }
            }
            mat=n;
            c++;
        }
    return false;
    }

}