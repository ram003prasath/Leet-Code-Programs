import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root == null){
            return lst;
        }
        return inOrd(root,lst);
    }

    public List<Integer> inOrd(TreeNode root, List<Integer> lst){
        if(root != null){
            inOrd(root.left, lst);
            lst.add(root.val);
            inOrd(root.right, lst);
        }
        return lst;
    }
}
