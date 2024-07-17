// 73. Set Matrix Zeroes
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean flag[][] = new boolean[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    flag[i][j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                if(flag[i][j]){
                    
                    for(int k = 0; k < matrix.length;k++){
                        matrix[k][j] = 0;
                    }
                    for(int k = 0; k < matrix[0].length;k++){
                        matrix[i][k] = 0;
                    }
                }
            }
        }
    }
}
