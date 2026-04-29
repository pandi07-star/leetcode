class Solution {
    public int majorityElement(int[] nums) {
        int i,j,count=0,s,half;
        s=nums.length;
        half=s/2;
        for(i=0;i<s;i++)
        {
            count=0;
            for(j=0;j<s;j++)
            {
                if(nums[i]==nums[j])
                {
                    count=count+1;
                }

            }
         if(count>half){
            return nums[i];
         }

        }
        return 0;
    }
}