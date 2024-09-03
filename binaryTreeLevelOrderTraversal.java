import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class binaryTreeLevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null){return lst;}
        int size;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curNode;

        while(!q.isEmpty()){
            List<Integer> curLevel = new ArrayList<>();
            size = q.size();

            for(int i=0; i<size; i++){
                curNode = q.poll();
                curLevel.add(curNode.val);
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
            lst.add(curLevel);

        }
        return lst;

    }
}