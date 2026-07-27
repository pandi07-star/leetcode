class Solution{
    public int maxFrequencyElements(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }

        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1){
                continue;
            }

            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count==max){
                ans+=count;
            }

            for(int k=i+1;k<nums.length;k++){
                if(nums[i]==nums[k]){
                    nums[k]=-1;
                }
            }
        }

        return ans;
    }
}