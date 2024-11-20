class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1)return 0;
        int[] arr = new int[nums.length];
        int sum=0;
        for(int i=nums.length-1;i>=0;--i){
            sum+=nums[i];
            arr[i]=sum;
        }
        sum=0;
        for(int i=0;i<nums.length;++i){
            sum+=nums[i];
            if(sum==arr[i])return i;
        }
        
        return -1;
    }
}