class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyhead = new ListNode(0);
        ListNode partitioned = new ListNode(0);
        ListNode current1 = dummyhead;
        ListNode current2 = partitioned;
        ListNode current = head;
        //mkb bhot dhyan rkhna hota hai yaar list pointer idhar udhar na jaaye yaha pe do list hai partioned se pehle or baadme and then unme unke do pointer jisse un dono me add hoga and then last me dono merge hojayegi bc
        while (current != null) {
            if (current.val < x) {
                current1.next = current;
                current1 = current1.next;
            } else {
                current2.next = current;
                current2 = current2.next;
            }
            current = current.next;
        }
        current2.next = null;
        current1.next = partitioned.next;
        return dummyhead.next;
    }
}