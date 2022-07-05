public class N2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOut = 0, temp;
        ListNode res = new ListNode(), curr = res;
        while(l1 != null && l2 != null) {
            temp = carryOut + l1.val + l2.val;
            curr.next = new ListNode(temp % 10);
            carryOut = temp / 10;
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1 != null) {
            temp = carryOut + l1.val;
            curr.next = new ListNode(temp % 10);
            carryOut = temp / 10;
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null) {
            temp = carryOut + l2.val;
            curr.next = new ListNode(temp % 10);
            carryOut = temp / 10;
            l2 = l2.next;
            curr = curr.next;
        }
        if(carryOut != 0) {
            curr.next = new ListNode(carryOut);
        }
        return res.next;
    }
}
