
class Solution {
    public ListNode deleteMiddle(ListNode head) {
         //just maintain a just prev pointer to slow and move them one per iteration same wow
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //include this edgecase kinda as well tooo fucking ruined my submission rate kinda 
       
        if(head.next == null){
            return null;
        }
        while(fast!=null&&fast.next!=null){
            dummy = dummy.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        dummy.next = dummy.next.next;
        return head;

        
    }
}