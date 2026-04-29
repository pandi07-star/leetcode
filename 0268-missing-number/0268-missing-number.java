class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {       count++;
                if(nums[i]!=i)
                {
                    return i;
                }  
                if(count==nums.length)
                {
                    return i+1;
                }      
        }
        return 0;

    }
}
