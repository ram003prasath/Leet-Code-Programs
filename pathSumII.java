import java.util.ArrayList;
import java.util.List;

public class pathSumII {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return result;
        }

        findPath(root, targetSum, new ArrayList<>());
        return result;

    }

    public void findPath(TreeNode root, int targetSum, List<Integer> lst){
        if(root == null){
            return;
        }
        lst.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            result.add(new ArrayList<>(lst));
        }
        findPath(root.left, targetSum - root.val, lst);
        findPath(root.right, targetSum - root.val, lst);
        lst.remove(lst.size()-1);
    }
}
