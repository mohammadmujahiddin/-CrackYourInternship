// 54. Spiral Matrix
// Given an m x n matrix, return all elements of the matrix in spiral order.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int srow = 0;
        int scol = 0;
        int erow = matrix.length-1;
        int ecol = matrix[0].length-1;

        while(srow <= erow && scol <= ecol){
            
            for(int i = scol; i <= ecol;i++){
                result.add(matrix[srow][i]);
            }
            for(int j = srow+1; j <= erow;j++){
                
                result.add(matrix[j][ecol]);
            }
            for(int i = ecol-1;i >= scol;i--){
                if(srow == erow) break;
                result.add(matrix[erow][i]);
            }
            for(int j = erow-1; j >= srow+1;j--){
                if(scol == ecol) break;
                result.add(matrix[j][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return result;
    }
}
