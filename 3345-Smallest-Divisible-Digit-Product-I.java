class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            int num=prod(n);
            if(num%t==0)return n;
            ++n;
        }
        
    }
    public int prod(int n){
        int num=1;
        while(n>0){
            num=num*(n%10);
            n/=10;
        }
        return num;
    }
}