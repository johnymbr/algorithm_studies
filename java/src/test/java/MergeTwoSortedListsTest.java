import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void test1() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = mtsl.mergeTwoLists(l1, l2);
        StringBuilder result = new StringBuilder("[");
        while (res != null) {
            if (result.length() > 1) {
                result.append(",");
            }
            result.append(res.val);
            res = res.next;
        }
        result.append("]");

        Assertions.assertEquals("[1,1,2,3,4,4]", result.toString());
    }

    @Test
    public void test2() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode res = mtsl.mergeTwoLists(null, null);
        StringBuilder result = new StringBuilder("[");
        while (res != null) {
            if (result.length() > 1) {
                result.append(",");
            }
            result.append(res.val);
            res = res.next;
        }
        result.append("]");

        Assertions.assertEquals("[]", result.toString());
    }

    @Test
    public void test3() {
        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
        ListNode l2 = new ListNode(0);

        ListNode res = mtsl.mergeTwoLists(null, l2);
        StringBuilder result = new StringBuilder("[");
        while (res != null) {
            if (result.length() > 1) {
                result.append(",");
            }
            result.append(res.val);
            res = res.next;
        }
        result.append("]");

        Assertions.assertEquals("[0]", result.toString());
    }
}
