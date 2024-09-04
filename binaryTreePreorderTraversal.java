import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root==null){ return lst; }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curNode;

        while(stack.size()!=0){
            curNode = stack.pop();
            lst.add(curNode.val);
            if(curNode.right!=null){
                stack.push(curNode.right);
            }
            if(curNode.left!=null){
                stack.push(curNode.left);
            }
        }
        return lst;
    }
}
