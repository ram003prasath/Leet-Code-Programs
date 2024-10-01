import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        int mat[][] = new int[numRows][numRows];
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            result.add(i, new ArrayList<>());
            for(int j=0; j<numRows; j++){
                if(j==0 || j==i){
                    mat[i][j] = 1;
                    result.get(i).add(mat[i][j]);
                    if(j==i){break;}
                }
                else{
                    mat[i][j] = mat[i-1][j-1]+mat[i-1][j];
                    result.get(i).add(mat[i][j]);
                }
            }
        }
        return result;
    }
}
