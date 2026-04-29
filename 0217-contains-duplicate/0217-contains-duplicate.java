import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> pandi = new HashSet<>();
        for (int num : nums) {
            if (!pandi.add(num)) {
                return true;
            }
        }
        return false;
    }
}
