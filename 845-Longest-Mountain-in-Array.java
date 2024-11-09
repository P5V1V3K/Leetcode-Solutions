class Solution {
    public int longestMountain(int[] arr) {
        int c=0;
        for(int i=1;i<arr.length-1;++i){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                int l=i, r=i, rc=0, lc=0;
                while(l-1>=0){
                    if(arr[l]>arr[l-1]){
                        ++lc;
                        --l;
                    }
                    else break;
                }
                if(lc!=0)while(r+1<arr.length){
                    if(arr[r]>arr[r+1]){
                        ++rc;
                        ++r;
                    }
                    else break;
                }
                if(lc!=0 && rc!=0)c=Math.max(1+lc+rc,c);
            }
        }
        return c;
    }
}