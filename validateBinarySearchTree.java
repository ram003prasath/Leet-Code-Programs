public class validateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return false;
        }
        
        return isValidBST(root,null,null);

    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max){

        if(root == null){
            return true;
        }

        if((min != null && root.val <= min) || (max != null && root.val >= max)){
            return false;
        }

        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);

    }

}
