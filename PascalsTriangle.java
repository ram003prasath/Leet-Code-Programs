import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for(int i=0; i<numRows; i++){
            result.add(i, new ArrayList<>(i+1));
            for(int j=0; j<numRows; j++){
                if(j==0 || j==i){
                    result.get(i).add(1);
                    if(j==i){break;}
                }
                else{
                    result.get(i).add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
        }
        return result;
    }
}
