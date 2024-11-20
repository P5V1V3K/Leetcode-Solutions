class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] avgs = new int[n];
        Arrays.fill(avgs,-1);
        if(k==0)return nums;
        if(n<2*k+1)return avgs;
        long sum=0;
        HashMap<Integer,Long> map = new HashMap<>();
        map.put(-1,0L);
        for(int i=0;i<n;++i){
            sum+=nums[i];
            map.put(i,sum);
        }
        int i=k;
        while(i<n-k){
            
            {
                int j=i-k,l=i+k;
                sum=map.get(l)-map.get(j-1);
                avgs[i]=(int)(sum/(2*k+1));
            }
            ++i;
        }
        return avgs;
    }
}