public class FlattenBinaryTreeToLinkedList {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root == null){ return; }
        flatten(root.left);
        flatten(root.right);
        root.right = prev;
        root.right = null;
        prev = root;
    }
}

