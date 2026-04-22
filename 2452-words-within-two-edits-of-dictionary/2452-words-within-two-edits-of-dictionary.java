class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>mahi=new ArrayList<>();
        int s1=queries.length;
        int s2=dictionary.length;
        for(int i=0;i<s1;i++)
        {
        for(int j=0;j<s2;j++)
        {
            if(paraisTrue(queries[i],dictionary[j]))
            {
                mahi.add(queries[i]);
                break;
            }
        }   
        }
        return mahi;
    }
    public boolean paraisTrue(String queries,String dictionary)
{
    int c=0;
    for(int i=0;i<queries.length();i++)
    {
          if(queries.charAt(i)!=dictionary.charAt(i)) 
          {
            c++;
          if(c>2) return  false;
          }
        }
    return true;
}
}