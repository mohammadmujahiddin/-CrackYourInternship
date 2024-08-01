83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode result = head;
        ListNode result1 = result;
        head = head.next;
        while(head != null){
            if(head.val != result.val){
                result.next = head;
                result = result.next;
            }
            head = head.next;
        }
        result.next = null;
        return result1;
    }
}
