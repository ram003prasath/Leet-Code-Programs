public class recoverBinarySearchTree {

    private TreeNode prevNode;
    private TreeNode firstNode;
    private TreeNode middleNode;
    private TreeNode lastNode;

    public void recoverTree(TreeNode root) {
        firstNode = middleNode = lastNode = null;
        prevNode = new TreeNode(Integer.MIN_VALUE);
        inorderTraversal(root);

        if(firstNode != null && lastNode == null){
            int t = firstNode.val;
            firstNode.val = middleNode.val;
            middleNode.val = t;
        }
        else if(firstNode != null && lastNode != null){
            int t = firstNode.val;
            firstNode.val = lastNode.val;
            lastNode.val = t;
        }

    }

    public void inorderTraversal(TreeNode curNode){
        if(curNode == null) return;

        inorderTraversal(curNode.left);

        if(prevNode != null && prevNode.val > curNode.val){ 
            if(firstNode == null){
                firstNode = prevNode;
                middleNode = curNode;
            }
            else{
                lastNode = curNode;
            }
        }
        prevNode = curNode;

        inorderTraversal(curNode.right);
    }
}
