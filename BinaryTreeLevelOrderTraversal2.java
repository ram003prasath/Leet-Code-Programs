import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return ans;
        bfs(root,0);
        return ans;
        
    }
    private void bfs(TreeNode root , int level)
    {
        if(root == null) return ;
        if(ans.size() == level) ans.add(0,new ArrayList<>());

        ans.get(ans.size() - level-1 ).add(root.val);

        bfs(root.left,level+1);
        bfs(root.right,level+1);
    }
}
