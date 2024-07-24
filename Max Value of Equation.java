1499. Max Value of Equation
You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, where points[i] = [xi, yi] such that xi < xj for all 1 <= i < j <= points.length.
  You are also given an integer k.
Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| <= k and 1 <= i < j <= points.length.
It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| <= k.




class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int result = Integer.MIN_VALUE;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0;i < points.length;i++){
            while(!q.isEmpty() && points[i][0] - points[q.peek()][0]>k) q.poll();

            if(!q.isEmpty()) {
                result = Math.max(result, points[i][0] + points[i][1] + points[q.peek()][1] - points[q.peek()][0]);
            }
            while (!q.isEmpty() && points[q.peekLast()][1] - points[q.peekLast()][0] < points[i][1] - points[i][0])
                q.pollLast();
            
            q.addLast(i);
        }
        return result;
    }
}
