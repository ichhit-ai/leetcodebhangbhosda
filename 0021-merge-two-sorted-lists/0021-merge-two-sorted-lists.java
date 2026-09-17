/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Handle edge cases where one or both lists are empty
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode head = null;
        ListNode current = null;
        
        // 1. Manually set the head for the first node
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        current = head;
        
        // 2. Loop through the rest with your explicit logic
        while (list1 != null && list2 != null) {
            if (list1.val == list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // 3. Attach whichever list still has nodes left
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        
        return head;
    }
}