class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int a=0,b=a+k;
        while(b+k-1<nums.size()){
            boolean f= check(nums,a,a+k);
            boolean s = check(nums,b,b+k);
            if(f && s)return true;
            a++;
            b++;
        }
            return false;  
    }
    public boolean check(List<Integer> nums, int i, int j){
        while(i+1<j){
            if(nums.get(i)>=nums.get(i+1))return false;
            ++i;
        }
        return true;
    }
}