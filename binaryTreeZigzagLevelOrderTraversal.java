import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();

        if(root == null){ return lst; }

        Queue<TreeNode> q = new LinkedList<>();
        int size;
        q.add(root);
        TreeNode curNode;
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            size = q.size();

            for(int i=0; i<size; i++){
                curNode = q.poll();

                if(leftToRight){
                    curLevel.add(curNode.val);
                }
                else{
                    curLevel.add(0,curNode.val);
                }

                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }

            leftToRight = !leftToRight;
            lst.add(curLevel);

        }
        return lst;
    }
}
