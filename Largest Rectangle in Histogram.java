84. Largest Rectangle in Histogram
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.



import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
       Stack<Integer>stack = new Stack<>();
     
        for(int i=0;i<=n;i++){
            int currHeight = (i==n) ? 0 : heights[i];

            while(!stack.isEmpty() && currHeight<heights[stack.peek()]){
                
                int top = stack.pop();
                int width = stack.isEmpty() ? i: i-stack.peek()-1;
                int area = heights[top]*width;
                maxArea = Math.max(maxArea , area);

            }//while

            stack.push(i);

        }//for loop
        return maxArea;

    }//function ends
}//class end  
