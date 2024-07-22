Rotten Oranges
Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges

We have to determine what is the earliest time after which all the oranges are rotten. 
A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. 




  class Solution {

    static int largestBst(Node root) {

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {

            return countNodes(root);

        }

        int left = largestBst(root.left);

        int right = largestBst(root.right);

        return Math.max(left, right);

    }

 

    static boolean isBST(Node node, int min, int max) {

        if (node == null) {

            return true;

        }

        if (node.data < min || node.data > max) {

            return false;

        }

        return isBST(node.left, min, node.data - 1) && isBST(node.right, node.data + 1, max);

    }

 

    static int countNodes(Node node) {

        if (node == null) {

            return 0;

        }

        return 1 + countNodes(node.left) + countNod

es(node.right);

    }

}

 
