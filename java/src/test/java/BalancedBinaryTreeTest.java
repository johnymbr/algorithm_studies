import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

    @Test
    public void test1() {
        TreeNode n7 = new TreeNode(7);
        TreeNode n15 = new TreeNode(15);
        TreeNode n20 = new TreeNode(20, n15, n7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n3 = new TreeNode(3, n9, n20);

        BalancedBinaryTree b = new BalancedBinaryTree();
        Assertions.assertTrue(b.isBalanced(n3));
    }

    @Test
    public void test2() {
//        TreeNode root =
    }
}
