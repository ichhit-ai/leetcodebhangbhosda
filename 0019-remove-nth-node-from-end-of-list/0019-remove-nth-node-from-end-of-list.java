class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //creating dummy node taaki head cases baadme ungli na kre 
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        //we want to run to n to get n+1 step cause we want slow to land not n step before but n+1 step before 
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        } //slow is exact at node before the node we want to delete  and then skip node 
        slow.next = slow.next.next;
        return dummy.next;
    }
}