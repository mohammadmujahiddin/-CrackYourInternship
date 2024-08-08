Sum Tree
Given a Binary Tree. Check for the Sum Tree for every node except the leaf node. Return true if it is a Sum Tree otherwise, return false.

A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes present in its left subtree and right subtree. 
An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.

class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        int target = root.data;
        int sum = 0;
        sum = helper(root.left) + helper(root.right);
        // System.out.println(sum);
        if(sum == 0) return true;
        
        return target == sum;
    }
    int helper(Node root){
        if(root == null) return 0;
        int sum = root.data + helper(root.left) + helper(root.right);
        return sum;
    }
}
