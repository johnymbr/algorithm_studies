public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int lsize = this.helper(root.left);
        int rsize = this.helper(root.right);

        return Math.abs(lsize - rsize) <= 1;

    }

    public int helper(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(helper(node.left), helper(node.right));
    }
}
