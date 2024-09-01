public class searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
    
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null){
            return false;
        }

        int n = matrix.length;
        int row = 0, col = matrix[0].length - 1;

        while(row <n && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }
}
