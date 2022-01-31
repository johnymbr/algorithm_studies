import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        this.helper(root, ret);

        return ret;
    }

    public void helper(TreeNode node, List<Integer> values) {
        if (node != null) {
            helper(node.left, values);
            values.add(node.val);
            helper(node.right, values);
        }
    }
}

