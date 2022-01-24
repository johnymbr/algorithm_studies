public class PalindromeLI {
    int val1 = 0;
    int val2 = 0;

    public void inner(ListNode head) {
        if (head == null) return;

        val1 = val1 * 10 + head.val;
        inner(head.next);
        val2 = val2 * 10 + head.val;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;

        inner(head);

        return val1 == val2;
    }
}