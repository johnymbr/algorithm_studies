import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    @Test
    public void test1() {
        TreeNode t1n4 = new TreeNode(4);
        TreeNode t1n3 = new TreeNode(3);
        TreeNode t1n2 = new TreeNode(2, t1n3, t1n4);

        TreeNode t2n4 = new TreeNode(4);
        TreeNode t2n3 = new TreeNode(3);
        TreeNode t2n2 = new TreeNode(2, t2n4, t2n3);

        TreeNode root = new TreeNode(1, t1n2, t2n2);

        Assertions.assertTrue(new SymmetricTree().isSymmetric(root));
    }
}
