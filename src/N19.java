public class N19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 1;
        ListNode current = head, rp = null;
        while (current.next != null) {
            current = current.next;
            c += 1;
            if (rp != null)
                rp = rp.next;
            else if (c == n + 1) {
                rp = head;
            }
        }
        if (rp == null)
            return head.next;
        rp.next = rp.next.next;
        return head;
    }
}
