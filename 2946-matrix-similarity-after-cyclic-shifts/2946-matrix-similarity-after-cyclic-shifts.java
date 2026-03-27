class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int s2[][]=new int[m][n];
        int r=m-1;
        int l=k%n;
        int p=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int s3=(j-l+n)%n;
                    if(i%2==0)
                    {
                        s2[i][s3]=mat[i][j];
                    }
                    else 
                    {
                    int s=(l+j)%n;
                        s2[i][s]=mat[i][j];
                    }
                }
            }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=s2[i][j]) return false;
            }
        }
        return true;
    }
}