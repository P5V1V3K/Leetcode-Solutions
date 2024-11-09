class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        int curr=0;
        for(int l=0, r=0;r<nums.length;++r){
            
            while(!set.add(nums[r])){
                curr-=nums[l];
                set.remove(nums[l++]);
            }
            curr+=nums[r];
            max=Math.max(curr,max);
        }
        return max;
    }
}