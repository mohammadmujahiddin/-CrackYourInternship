2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Sum = new ListNode(0);
        ListNode q1=Sum;
        int carry=0;
        while(l1!=null||l2!=null){
            int sum = 0+carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            sum = sum%10;
            q1.next=new ListNode(sum);
            q1=q1.next;
        }
        if(carry==1){
            q1.next=new ListNode(1);
        }
        return Sum.next;
    }
}
