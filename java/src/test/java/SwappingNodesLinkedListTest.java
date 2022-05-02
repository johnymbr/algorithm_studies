import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwappingNodesLinkedListTest {

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        Assertions.assertEquals(4, new SwappingNodesLinkedList().swapNodes(head, 2).next.val);
    }
}
