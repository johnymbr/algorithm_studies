import java.util.ArrayList;
import java.util.List;

public class SwappingNodesLinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        List<ListNode> list = new ArrayList<>();

        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        int temp = list.get(k - 1).val;
        list.get(k - 1).val = list.get(list.size() - k).val;
        list.get(list.size() - k).val = temp;

        return head;
    }
}
