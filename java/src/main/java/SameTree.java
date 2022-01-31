import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null ^ q == null) return false;

        Queue<TreeNode> queue = new LinkedList();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            TreeNode paux = queue.remove();
            TreeNode qaux = queue.remove();

            if (paux.val != qaux.val) return false;

            if (paux.left != null && qaux.left != null) {
                queue.add(paux.left);
                queue.add(qaux.left);
            } else if(paux.left == null ^ qaux.left == null) {
                return false;
            }

            if (paux.right != null && qaux.right != null) {
                queue.add(paux.right);
                queue.add(qaux.right);
            } else if(paux.right == null ^ qaux.right == null) {
                return false;
            }
        }

        return true;
    }
}