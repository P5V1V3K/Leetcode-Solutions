class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0;
        for(int n:bills){
            if(n==5)f++;
            else if(n==20){
                if(f>=1 && t>=1){
                    --f;
                    --t;
                }
                else if(f>=3){
                    f-=3;
                }
                else return false;
            }
            else{
                if(f>=1){
                    --f;
                    ++t;
                }
                else return false;
            }
        }
        return true;
    }
}