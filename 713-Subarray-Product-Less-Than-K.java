class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int ans=0,prod=1,j=0;
        for(int i=0;i<nums.length;++i){
            prod*=nums[i];
            
            while(prod>=k){
                prod/=nums[j++];
            }
            ans=i-j+1+ans;
        }
        return ans;
    }
}