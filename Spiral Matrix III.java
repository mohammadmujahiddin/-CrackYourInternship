885. 
You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner is at the first row and column in the grid, and 
the southeast corner is at the last row and column.
You will walk in a clockwise spiral shape to visit every position in this grid. Whenever you move outside the grid's boundary,
we continue our walk outside the grid (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.
Return an array of coordinates representing the positions of the grid in the order you visited them.

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Direction vectors: right, down, left, up
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int totalCells = rows * cols;
        int[][] result = new int[totalCells][2];
        int r = rStart, c = cStart;
        int direction = 0; // start by moving right
        int steps = 1;
        int index = 0;

        result[index++] = new int[]{r, c};
        
        while (index < totalCells) {
            for (int i = 0; i < 2; i++) { // there are 2 turns in each full spiral loop
                for (int j = 0; j < steps; j++) {
                    r += dr[direction];
                    c += dc[direction];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[index++] = new int[]{r, c};
                        if (index == totalCells) {
                            return result;
                        }
                    }
                }
                direction = (direction + 1) % 4; // change direction
            }
            steps++; // increase the number of steps after two turns
        }

        return result;
    }
}
