public class pathSumTree {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return root.val == targetSum;
        }

        int newTargetSum = targetSum - root.val;

        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
        
    }
}
