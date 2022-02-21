import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {

    @Test
    public void test1() {
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        SwapNodesInPairs s = new SwapNodesInPairs();
        Assertions.assertEquals(2, s.swapPairs(n1).val);
    }

    @Test
    public void test2() {
        SwapNodesInPairs s = new SwapNodesInPairs();
        Assertions.assertNull(s.swapPairs(null));
    }

    @Test
    public void test3() {
        SwapNodesInPairs s = new SwapNodesInPairs();
        Assertions.assertEquals(1, s.swapPairs(new ListNode(1)).val);
        Assertions.assertNull(s.swapPairs(new ListNode(1)).next);
    }
}
