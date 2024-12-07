class Solution {
    public int minOperations(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;++i){
            if(nums[i]<k)return -1;
            if(!list.contains(nums[i]))list.add(nums[i]);
        }
        Collections.reverse(list);
        int ans=0;
        for(int i=1;i<list.size();++i){
            if(list.get(i-1)==k)continue;
            if(list.get(i-1)>k){
                list.set(i-1,list.get(i));
                ++ans;
            }
        }
        
        if(list.get(list.size()-1)==k)return ans;
        if(list.get(list.size()-1)>k)return ans+1;
        return -1;
    }
}