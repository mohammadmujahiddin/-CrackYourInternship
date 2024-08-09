class Solution {

    int Maximize(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long res = 0;
        int m = (int)(1e9 + 7);
        for(int i = 1;i < arr.length;i++){
            res = (res + ((long)arr[i]*i)%m)%m;
        }
        return (int)(res%m);
    }
}
Maximize Array Value After Rearrangement
Given an array arr of n integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n-1. 
You are allowed to rearrange the elements of the array.
Note: Since the output could be large, print the answer modulo 109+7.
