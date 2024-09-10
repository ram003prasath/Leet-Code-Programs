import java.util.HashMap;
import java.util.Map;

public class constructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inMap = new HashMap<>();

        for(int i=0; i < inorder.length; i++){
            inMap.put(inorder[i],i);
        }

        TreeNode root = buildTree(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, inMap);

        return root;
    }

    public TreeNode buildTree(int postorder[], int poStart, int poEnd, int inorder[], int inStart, int inEnd, Map<Integer, Integer> inMap){

        if(poStart > poEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(postorder[poEnd]);

        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(postorder, poStart, poStart+numsLeft-1, inorder, inStart, inRoot-1, inMap);
        root.right = buildTree(postorder, poStart+numsLeft, poEnd-1, inorder, inRoot+1, inEnd, inMap);
        return root;
    }
}
