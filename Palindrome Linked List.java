234. Palindrome Linked List
Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise.


class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return false;
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while(head != null) {
            st.push(head.val);
            head = head.next;
        }
        while(temp != null){
            if(temp.val != st.pop()) return false;
            temp = temp.next;
        }
        return true;
    }
}
