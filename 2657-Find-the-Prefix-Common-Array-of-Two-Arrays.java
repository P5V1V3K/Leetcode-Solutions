class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int[] f = new int[n+1];
        int common=0;
        for(int i=0;i<n;++i){
            f[A[i]]++;
            f[B[i]]++;
            if(A[i]==B[i])++common;
            else{
                if(f[A[i]]==2)++common;
                if(f[B[i]]==2)++common;
            }
            C[i]=common;
        }
        return C;
    }
}