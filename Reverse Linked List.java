206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.



class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nextNode = null;
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
