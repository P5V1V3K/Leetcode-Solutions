class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<String>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words[0].length();++i){
            map.put(words[0].charAt(i),map.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=1;i<words.length;++i){
            HashMap<Character,Integer> currMap = new HashMap<>();
            String word=words[i];
            for(int j=0;j<word.length();++j){
                currMap.put(word.charAt(j),currMap.getOrDefault(word.charAt(j),0)+1);
            }
            for(char c:map.keySet()){
                if(currMap.containsKey(c))map.put(c,Math.min(currMap.get(c),map.get(c)));
                else{
                map.put(c,0);
            }
            }
            
        }
        for(char c : map.keySet()){
            int n=map.get(c);
            for(int i=0;i<n;++i){
                ans.add(String.valueOf(c));
            }
        }
        return ans;
    }
}