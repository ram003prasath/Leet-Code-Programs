import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){ return ans; }
        
        bfs(root, 0);
        return ans;
    }

    public void bfs(TreeNode root, int level){
        if(root == null) return;
        if(ans.size() == level) ans.add(new ArrayList<>());

        ans.get(level).add(root.val);

        bfs(root.left, level+1);
        bfs(root.right, level+1);

    }
}