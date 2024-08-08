Rat in a Maze Problem - I
Consider a rat placed at (0, 0) in a square matrix mat of order n* n. It has to reach the destination at (n - 1, n - 1). 
Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). 
Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell. In case of no path, return an empty list. 
The driver will output "-1" automatically.

class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> res = new ArrayList<>();
        
        if (mat == null || mat.length == 0 || mat[0].length == 0 || mat[0][0] == 0) {
            return res; // No paths if the matrix is empty or the start is blocked.
        }

        boolean[][] visited = new boolean[mat.length][mat[0].length];
        helper(0, 0, mat, res, "", visited);
        return res;
    }
    
    private void helper(int i, int j, int[][] mat, ArrayList<String> res, String ans, boolean[][] visited) {
        // Check for boundaries and if the cell is already visited or blocked.
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || mat[i][j] == 0 || visited[i][j]) {
            return;
        }

        // If we reach the bottom-right corner, add the current path to the result.
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            res.add(ans);
            return;
        }

        // Mark the cell as visited.
        visited[i][j] = true;

        // Explore all four possible directions.
        // Moving down.
        helper(i + 1, j, mat, res, ans + "D", visited);
        // Moving up.
        helper(i - 1, j, mat, res, ans + "U", visited);
        // Moving left.
        helper(i, j - 1, mat, res, ans + "L", visited);
        // Moving right.
        helper(i, j + 1, mat, res, ans + "R", visited);

        // Unmark the cell as visited to allow for backtracking.
        visited[i][j] = false;
    }
}
