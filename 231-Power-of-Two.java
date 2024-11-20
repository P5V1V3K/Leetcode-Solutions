class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)return false;
        return pow(n);
    }
    public boolean pow(int n){
        if(n==1)return true;
        if(n%2!=0)return false;
        return pow(n/2);
    }
}