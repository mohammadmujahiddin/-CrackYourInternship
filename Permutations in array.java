Permutations in array
Given two arrays arr1[], arr2[], and an integer k. The task is to check if after permuting 
both arrays in such a way, we get the sum of their corresponding element greater than or equal to k i.e. 
arr1i + arr2i >= k for all i (from 0 to n-1). Return true if possible, else false. 

class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0;i < arr1.length;i++){
            if(arr1[i] + arr2[arr2.length - 1 - i] < k){
                return false;
            }
        }
        
        return true;
    }
}
