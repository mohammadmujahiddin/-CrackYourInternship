Delete nodes having greater value on right
Given a singly linked list, remove all the nodes in the list which have any node on their right whose value is greater. 
(Not just immediate Right , but entire List on the Right)


class Solution
{
    Node compute(Node head)
    {
        // your code here
        if(head.next == null) return head;
        Node connect = compute(head.next);
        
        if(head.data >= connect.data){
            head.next = connect;
            return head;
        }
        return connect;
    }
}
