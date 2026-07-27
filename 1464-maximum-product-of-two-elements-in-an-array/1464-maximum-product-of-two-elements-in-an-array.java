class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums[nums.length-1];
        int l2=nums[nums.length-2];
        return (l-1)*(l2-1);
    }
}