import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    @Test
    public void test1() {
        ListNode n4 = new ListNode(4);
        ListNode n0 = new ListNode(0, n4);
        ListNode n2 = new ListNode(2, n0);
        n4.next = n2;
        ListNode n3 = new ListNode(3, n2);

        LinkedListCycle llc = new LinkedListCycle();
        Assertions.assertTrue(llc.hasCycle(n3));
    }

    @Test
    public void test2() {
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1, n2);
        n2.next = n1;

        LinkedListCycle llc = new LinkedListCycle();
        Assertions.assertTrue(llc.hasCycle(n1));
    }

    @Test
    public void test3() {
        ListNode n1 = new ListNode(1);

        LinkedListCycle llc = new LinkedListCycle();
        Assertions.assertFalse(llc.hasCycle(n1));
    }
}
