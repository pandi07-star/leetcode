class Solution {
    public String reverseWords(String s) {
        StringBuilder s2 = new StringBuilder();
        String [] arr = s.split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            String s1=arr[i];
            for(int j=s1.length()-1;j>=0;j--)
            {
                s2.append(s1.charAt(j));
            }
             if (i < arr.length - 1) {
                s2.append(" ");
            }
        }
    return s2.toString().trim();
    }
}