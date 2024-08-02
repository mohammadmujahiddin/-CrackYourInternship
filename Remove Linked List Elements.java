203. Remove Linked List Elements
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode result = new ListNode();
        ListNode curr = result;
        while(head != null){
            if(head.val != val){
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null;
        return result.next;
    }
}
