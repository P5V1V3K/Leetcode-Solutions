class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] arr = new int[n];
        for(int num : banned){
            if(num<=n)arr[num-1]=1;
        }
        int sum=0,count=0,i=0;
        while(sum<=maxSum && i<n){
            if(arr[i]!=1){
                sum+=i+1;
                ++count;
            }
            ++i;
        }
        if(sum<=maxSum)return count;
        return count-1;
    }
}