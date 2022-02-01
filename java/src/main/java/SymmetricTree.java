public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;

        return isSameTree(root.left, root.right);
    }

    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        if (t1.val != t2.val) return false;

        return isSameTree(t1.left, t2.right) && isSameTree(t1.right, t2.left);
    }
}
