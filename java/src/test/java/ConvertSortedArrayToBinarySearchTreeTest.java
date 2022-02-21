import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void test1() {
        ConvertSortedArrayToBinarySearchTree c = new ConvertSortedArrayToBinarySearchTree();
        Assertions.assertEquals(0, c.sortedArrayToBST(new int[]{-10,-3,0,5,9}).val);
    }
}
