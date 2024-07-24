289. Game of Life
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). 
Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
Given the current state of the m x n grid board, return the next state.



import java.util.*;

class Solution {
    public void gameOfLife(int[][] board) {
        // Define the relative positions of the 8 possible neighbors
        int[][] directions = {{1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}};
        
        int rows = board.length;
        int cols = board[0].length;
        
        // First pass: mark the cells with special values for state changes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int live = 0;
                
                // Count live neighbors
                for (int[] dir : directions) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols && Math.abs(board[x][y]) == 1) {
                        live++;
                    }
                }
                
                // Apply rules:
                if (board[i][j] == 1 && (live < 2 || live > 3)) {
                    board[i][j] = -1;  // Mark as -1 to indicate the cell was live but now dead
                }
                if (board[i][j] == 0 && live == 3) {
                    board[i][j] = 2;   // Mark as 2 to indicate the cell was dead but now live
                }
            }
        }
        
        // Second pass: finalize the state changes
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;  // Convert cells marked 1 or 2 to live
                } else {
                    board[i][j] = 0;  // Convert cells marked -1 or 0 to dead
                }
            }
        }
    }
}  
