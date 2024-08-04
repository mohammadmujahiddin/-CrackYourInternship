Find Pair Given Difference
Given an array arr[] of size n and an integer x, return 1 if there exists a pair of elements in the array whose absolute difference is x, otherwise, return -1.

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        while(j < n && i < n){
            if(arr[j] - arr[i] == x && i != j) return 1;
            else if(arr[j] - arr[i] < x) j++;
            else i++;
        }
        return -1;
    }
}
