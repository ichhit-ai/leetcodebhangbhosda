class Solution {
    public int getDecimalValue(ListNode head) {
        String binary = "";
        while (head != null) {
            binary += head.val;
            head = head.next;
        }
        return Integer.parseInt(binary, 2);
    }
}
