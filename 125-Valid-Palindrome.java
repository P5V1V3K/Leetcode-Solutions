class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(\\))return true;
        s=s.toLowerCase();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char a = s.charAt(l);
            char b = s.charAt(r);
            if(!((a>='a' && a<='z') || (a>='0' && a<='9'))){++l;continue;}
            if(!((b>='a' && b<='z') || (b>='0' && b<='9'))){--r;continue;}
            
            if(s.charAt(l)!=s.charAt(r))return false;
            ++l;
            --r;
        }
        return true;
    }
}