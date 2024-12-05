class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Double> set = new HashSet<>();
        for(int i=0;i<arr.length;++i){
            if(set.contains((double)arr[i]*2) || set.contains((double)arr[i]/2.0))return true;
            set.add((double)arr[i]);
        }
        return false;
    }
}