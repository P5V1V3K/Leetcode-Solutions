class Solution {
    public int countValidSelections(int[] nums) {
        int ans=0, lsum=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==0){
                int j=i+1,rsum=0;
                while(j<nums.length){
                    rsum+=nums[j];
                    ++j;
                }
                if(lsum==rsum)ans+=2;
                else if(lsum-rsum==1 || lsum-rsum==-1)ans+=1;
            }
            lsum+=nums[i];
        }
        return ans;
    }
}