public class searchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int start = 0, end = n*m-1, mid, row, col;

        while(start<=end){
            mid = start + (end - start) /2;
            row = mid / m;
            col = mid % m;
            if(matrix[row][col] == target){
                return true;
            }

            else if(target < matrix[row][col]){
                end = mid -1;
            }

            else{
                start = mid + 1;
            }

        }
        return false;
    }
}
