class Solution {
    public int mirrorDistance(int n) {
        String s1=String.valueOf(n);
        String s2=new StringBuilder(s1).reverse().toString();
        int n1=Integer.parseInt(s2);
        int n2=Math.abs(n1-n);
        return n2;
    }
}