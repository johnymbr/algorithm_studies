import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeLITest {

    @Test
    public void test1() {
        PalindromeLI p = new PalindromeLI();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Assertions.assertTrue(p.isPalindrome(head));
    }

    @Test
    public void test2() {
        PalindromeLI p = new PalindromeLI();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

//        Assertions.assertTrue(p.isPalindrome(head));
    }
}
