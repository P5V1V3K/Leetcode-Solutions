class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=0, n=nums.length, j=0;
        int sum=0;
        for(int i=0;i<n;++i){
            sum=sum+nums[i];
            while(j<=i && sum>=target){
                
                if(ans!=0)ans=ans>i-j+1?i-j+1:ans;
                else ans=i-j+1;
            
                sum=sum-nums[j];
                ++j;
            }
            
        }
        return ans;
    }
}