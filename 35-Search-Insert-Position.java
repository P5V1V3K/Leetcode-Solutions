class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int m=(s+e)/2;
        while(s<=e){
            m=(s+e)/2;
            if(nums[m]==target)return m;
            else if(target>nums[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }

        }
        if(target>nums[m])return m+1;
        return m;
    }
}