import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode tn7 = new TreeNode(7);
        TreeNode tn15 = new TreeNode(15);
        TreeNode tn20 = new TreeNode(20, tn15, tn7);
        TreeNode tn9 = new TreeNode(9);
        TreeNode root = new TreeNode(3, tn9, tn20);

        MaximumDepthOfBinaryTree max = new MaximumDepthOfBinaryTree();
        Assertions.assertEquals(3, max.maxDepth(root));
    }
}
