class Solution {
    public int bestRotation(int[] nums) {
        int n=nums.length;
        int[] rotateLoss=new int[n];
        int[] score=new int[n];
        for(int i=0;i<n;++i)rotateLoss[(i-nums[i]+n+1)%n]+=1;
        int max=score[0];
        int max_i=0;
        for(int i=1;i<n;++i){
            score[i]=score[i-1]-rotateLoss[i]+1;
            if(score[i]>max){
                max=score[i];
                max_i=i;
            }
        }
        return max_i;
    }
}