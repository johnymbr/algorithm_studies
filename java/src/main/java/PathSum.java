public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        return helper(root, targetSum, 0);
    }

    private boolean helper(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;

        if ((sum + root.val) == targetSum && root.right == null && root.left == null) return true;

        boolean hasPathSum = helper(root.right, targetSum, sum + root.val);
        if (!hasPathSum)
            hasPathSum = helper(root.left, targetSum, sum + root.val);

        return hasPathSum;
    }
}
