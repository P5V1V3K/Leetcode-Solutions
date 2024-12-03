class Solution {
    int max = 0;
    int l = 0;
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        if(s.length() < 2) return s;
        
        for(int i = 0; i<arr.length; i++) {
            expandPalindrome(arr, i, i);
            expandPalindrome(arr, i, i+1);
        }
        return s.substring(l, l+max);
    }
    
    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(max < k - j - 1) {
            max = k - j - 1;
            l = j+1;
        }
    }
}