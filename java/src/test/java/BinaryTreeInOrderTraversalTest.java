import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeInOrderTraversalTest {

    @Test
    public void test1() {
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(1, null, n2);

        BinaryTreeInOrderTraversal b = new BinaryTreeInOrderTraversal();
        Assertions.assertEquals(3, b.inorderTraversal(root).size());
    }
}
