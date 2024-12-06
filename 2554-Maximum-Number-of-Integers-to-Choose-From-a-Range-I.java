class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        long sum=n*(n+1)/2;
        int count=n;
        HashSet<Integer> set = new HashSet<>();
        for(int num : banned){
            if(num<=n && !set.contains(num)){
                sum-=num;
                --count;
            }
            set.add(num);
        }
        while(sum>maxSum){
            if(!set.contains(n)){
                sum-=n;
                --count;
            }
            --n;
        }
        return count;
    }
}