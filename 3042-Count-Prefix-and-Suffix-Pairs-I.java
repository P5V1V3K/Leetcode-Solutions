class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n= words.length, ans=0;
        for(int i=0;i<n;++i){
            String a = words[i];
            for(int j=i+1; j<n; ++j){
                String b=words[j];
                if(b.length()<a.length())continue;
                if(b.startsWith(a) && b.endsWith(a))++ans;
            }
        }
        return ans;
    }
}