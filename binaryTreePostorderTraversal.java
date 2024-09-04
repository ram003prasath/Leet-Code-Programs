import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root == null){ return lst; }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;
        stack.push(curNode);

        while(stack.size()!=0){
            curNode = stack.pop();
            lst.add(0,curNode.val);
            
            if(curNode.left!=null){
                stack.push(curNode.left);
            }
            if(curNode.right!=null){
                stack.push(curNode.right);
            }
        }
        return lst;
    }
}
