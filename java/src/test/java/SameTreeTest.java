import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

    @Test
    public void test1() {
        TreeNode t1n3 = new TreeNode(3);
        TreeNode t1n2 = new TreeNode(2);
        TreeNode t1n1 = new TreeNode(1, t1n2, t1n3);

        TreeNode t2n3 = new TreeNode(3);
        TreeNode t2n2 = new TreeNode(2);
        TreeNode t2n1 = new TreeNode(1, t2n2, t2n3);

        Assertions.assertTrue(new SameTree().isSameTree(t1n1, t2n1));
    }

    @Test
    public void test2() {
        TreeNode t1n2 = new TreeNode(2);
        TreeNode t1n1 = new TreeNode(1, t1n2, null);

        TreeNode t2n2 = new TreeNode(2);
        TreeNode t2n1 = new TreeNode(1, null, t2n2);

        Assertions.assertFalse(new SameTree().isSameTree(t1n1, t2n1));
    }
}
