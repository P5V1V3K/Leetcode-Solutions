class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0,k=0;
        char[] arr = new char[word1.length() + word2.length()];
        while(i<word1.length() && j<word2.length()){
            if(i==j){
                arr[k]=word1.charAt(i);
                ++i;
            }
            else{
                arr[k]=word2.charAt(j);
                ++j;
            }
            ++k;
        }
        if(i!=word1.length()){
            while(i<word1.length()){
                arr[k]=word1.charAt(i);
                ++i;
                ++k;
            }
        }
        if(j!=word2.length()){
            while(j<word2.length()){
                arr[k]=word2.charAt(j);
                ++j;
                ++k;
            }
        }
        return new String(arr);
    }
}