class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length(), ans=0;
        for(String s:words){
            if(s.length()<n)continue;
            if(s.substring(0,n).equals(pref))++ans;
        }
        return ans;
    }
}