class Solution {
    public int maxDistinct(String s) {
         Set<Character> d = new HashSet<>();
         for(char a : s.toCharArray())
         {
            d.add(a);
         }
    return d.size();
    }
}