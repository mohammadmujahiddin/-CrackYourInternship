Max rectangle
Given a binary matrix M of size n X m. Find the maximum area of a rectangle formed only of 1s in the given matrix.

class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int maxArea = 0;
        int height[] = new int[M[0].length];
        for(int row[]: M){
            for(int i = 0;i < M[0].length;i++){
                if(row[i] == 1) height[i]++;
                else height[i] = 0;
            }
            
            int area = Histogram(height);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
        
    }
    private int Histogram(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int result = 0;
        for(int i = 0;i <= n;i++){
            int currH = (i == n) ? 0: arr[i];
            
            while(!st.isEmpty() && currH < arr[st.peek()]){
                int top = st.pop();
                int width = st.isEmpty() ? i: i - st.peek()-1;
                int area = arr[top]*width;
                result = Math.max(result, area);
            }
            st.push(i);
        }
        return result;
    }
    
}
