class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<n;++i){
            sum=0;
            for(int j=i;j<n;++j){
                sum+=nums.get(j);
                if((j-i+1)>=l && (j-i+1)<=r){
                    if(sum>0)ans=ans<sum?ans:sum;
                }
                else if(j-i+1>r)break;
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}
    