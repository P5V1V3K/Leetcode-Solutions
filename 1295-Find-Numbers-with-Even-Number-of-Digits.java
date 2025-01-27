import java.util.Scanner;
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num : nums){
            c=((int)(Math.floor(Math.log10(num))+1) & 1) == 0 ? ++c : c;
        }
        return c;
    }
}