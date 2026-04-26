class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> d = new HashSet<>();
        int c=0;
        for(char s:jewels.toCharArray())
        {
            for(char t:stones.toCharArray())
            {
                if(s==t)
                {
                    c++;
                }
            }
        }
        
    return c;
    }
}