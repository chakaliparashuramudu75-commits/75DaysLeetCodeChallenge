class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
    int m=grid.length;
    int n=grid[0].length;
    int s=m*n;
    long arr[]=new long[s];
    int idx=0;
    //long mod=100000007;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[idx++]=grid[i][j];
        }
    }
    long pre=1;
    int k=arr.length;
    long res[]=new long[k];
    for(int i=0;i<s;i++)
    {
        res[i]=pre;
        pre=(pre*arr[i])%12345;
    }
    long suf=1;
    for(int j=k-1;j>=0;j--)
    {
        res[j]*=suf;
        suf=(suf*arr[j])%12345;
    }
    int u=0;
    int g[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            g[i][j]=(int)res[u++]%12345;
        }
    }
    return g;
    }
}