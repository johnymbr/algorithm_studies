public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode aux = swapPairs(head.next.next);
        ListNode temp = head.next;
        temp.next = head;
        head.next = aux;

        return temp;
    }
}
