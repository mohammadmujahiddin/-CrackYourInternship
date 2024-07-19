// 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.



class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int right = height.length-1;
        int left = 0;

        while(right != left){
            int len = Math.min(height[right], height[left]);
            int wid = right - left;
            int area = len*wid;
            maxWater = Math.max(area, maxWater);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
