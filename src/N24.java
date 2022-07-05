public class N24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head), current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode node1 = current.next, node2 = current.next.next;
            current.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            current = node1;
        }
        return dummy.next;
    }
}
