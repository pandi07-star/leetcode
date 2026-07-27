class Solution {
    public int sumOfUnique(int[] nums) {
        int l = nums.length;
        int sum = 0;
        for(int i=0;i<l;i++) {
            int count=0;
            for(int j = 0; j < l; j++) {
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count == 1) {
                sum=sum+nums[i];
            }
        }
        return sum;
    }
} 