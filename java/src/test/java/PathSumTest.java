import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PathSumTest {

    @Test
    public void test1() {
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n11 = new TreeNode(11, n7, n2);
        TreeNode n13 = new TreeNode(13);
        TreeNode n4 = new TreeNode(4, null, n1);
        TreeNode n4l = new TreeNode(4, n11, null);
        TreeNode n8 = new TreeNode(8, n13, n4);
        TreeNode n5 = new TreeNode(5, n4l, n8);

        PathSum p = new PathSum();
        Assertions.assertTrue(p.hasPathSum(n5, 22));
    }

    @Test
    public void test2() {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n1 = new TreeNode(1, n2, n3);

        PathSum p = new PathSum();
        Assertions.assertFalse(p.hasPathSum(n1, 5));
    }

    @Test
    public void test3() {
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1, n2, null);

        PathSum p = new PathSum();
        Assertions.assertFalse(p.hasPathSum(n1, 1));
    }
}
