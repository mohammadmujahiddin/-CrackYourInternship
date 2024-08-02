Multiply two linked lists
Given elements as nodes of the two singly linked lists. 
The task is to multiply these two linked lists, say L1 and L2.
Note: The output could be large take modulo 10^9+7

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long s1 = 0;
        long s2 = 0;
        long m = 1000000007;
        while(first != null){
            s1 = (s1*10)%m + first.data;
            first = first.next;
        }
        while(second != null){
            s2 = (s2*10)%m + second.data;
            second = second.next;
        }
        return (s1*s2)%m;
    }
}

