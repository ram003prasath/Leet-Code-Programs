import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        long prev=1;
        for(int i=1;i<=rowIndex;i++){
            long curr=prev*(rowIndex-i+1)/i;
            res.add((int)curr);
            prev=curr;
        }
        return res;
    }
}
