class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ls = new ArrayList<>();
        int n=words1.length, m=words2.length;
        int[] bMax=new int[26];
        for(String s : words2){
            int[] bArr=new int[26];
            for(char c:s.toCharArray()){
                int idx=c-'a';
                bArr[idx]++;
                bMax[idx]=bMax[idx]>bArr[idx]?bMax[idx]:bArr[idx];
            }
        }
        for(String s:words1){
            int[] aArr=new int[26];
            for(char c:s.toCharArray()){
                aArr[c-'a']++;
            }
            if(check(bMax,aArr)){
                ls.add(s);
            }
        }
        return ls;
    }
    private boolean check(int[] bMax, int[] aArr){
        for(int i=0;i<26;++i){
            if(bMax[i]>aArr[i])return false;
        }
        return true;
    }
}