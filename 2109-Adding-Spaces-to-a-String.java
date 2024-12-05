class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length(), m = spaces.length;
        char[] arr = new char[n+m];
        char[] schar = s.toCharArray();
        int i=0,j=0;
        for(int space : spaces){
            while(j<space){
                arr[i++]=schar[j++];
            }
            arr[i++]=' ';
        }
        while(j<n){
            arr[i++]=schar[j++];
        }
        return new String(arr);
    }
}