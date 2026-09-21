class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head;
        int zerocount = 1;
        ListNode dummy = head;
        ListNode curr = head;
        int sum = 0;
//thinking of finding sum between zeroes and then add it to first zero and then that points to after second zero and same kinda process kinda 
        while (curr.next != null) {
            if (curr.next.val == 0) {
                zerocount++;
            }

            sum = sum + curr.next.val;
//make sure to move dummy as well
            if (zerocount == 2) {
                ListNode add = new ListNode(sum);
                dummy.next = add;
                dummy = dummy.next;
                zerocount = 1;
                sum = 0;
            }
            curr = curr.next;
        }
        return head.next;
    }
}
