class Solution {
    public int mirrorDistance(int n) {
       String s = String.valueOf(n); 
       String [] arr = new String [s.length()];
       int a=0;
       for(int i=s.length()-1;i>=0;i--)
       {
        arr[a++]=String.valueOf(s.charAt(i));
       }
       String val="";
       for(int i=0;i<arr.length;i++)
       {
         val =val+Integer.parseInt(arr[i]);
       }
       int r=Integer.parseInt(val);
       return Math.abs(n-r);
    }
}