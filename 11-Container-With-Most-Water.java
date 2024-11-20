class Solution {
    public int maxArea(int[] height) {
        int ans=0,i=0,j=height.length-1;
        while(i<j){
            int area = (height[i]<height[j]?height[i]:height[j])*Math.abs((i-j));
            ans=(ans>area?ans:area);
            if(height[i]>height[j])--j;
            else ++i;
        }
        return ans;
    }
}