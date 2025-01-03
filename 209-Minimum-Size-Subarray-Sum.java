class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=0, n=nums.length, j=0;
        int[] sum=new int[n+1];
        for(int i=0;i<n;++i){
            sum[i+1]=sum[i]+nums[i];
            if(sum[i+1]>=target){
                if(ans!=0)ans=ans>i-j+1?i-j+1:ans;
                else ans=i-j+1;
            }
            while(j<=i && sum[i+1]>target){
                sum[i+1]=sum[i+1]-nums[j];
                ++j;
                if(sum[i+1]>=target){
                if(ans!=0)ans=ans>i-j+1?i-j+1:ans;
                else ans=i-j+1;
            }
            }
            
        }
        return ans;
    }
}