
class Solution {
    public int pairSum(ListNode head) {
        //first fidning the mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reversing as well kinda yeah yeah
        ListNode prev = null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        //taking such pointer for other half of list kinda bc
        ListNode second = prev;
        int max = 0;
        int sum = 0;
        //pointer based traverse to find sum in both lists 
        while(second!=null && head!=null){
            sum = head.val + second.val;
            if(sum>=max){
                max = sum;
            }
            head = head.next;
            second = second.next;
        }
        return max;
    }
}