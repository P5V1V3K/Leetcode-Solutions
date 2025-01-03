class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0, right=0;
        for(int num : nums){
            left=Math.max(left,num);
            right+=num;
        }
        while(left<right){
            int mid=(left+right)/2;
            if(split(nums, mid)<=k){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    private int split(int[] nums, int max){
        int splits=1, curr=0;
        for(int num:nums){
            if(curr+num>max){
                splits++;
                curr=num;
            }
            else{
                curr+=num;
            }

        }
        return splits;
    }
}