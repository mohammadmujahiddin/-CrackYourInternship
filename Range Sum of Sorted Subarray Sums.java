1508. Range Sum of Sorted Subarray Sums
You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous subarrays 
from the array and then sorted them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.
Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array. 
Since the answer can be a huge number return it modulo 109 + 7.


class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int m = 1000000007;
        int len = n*(n+1)/2;
        int arr[] = new int[len];
        int j = 0;
        int sum = 0;
        for(int i = 0;i < n;i++){
            arr[j] = nums[i] % m;
            sum += nums[i];
            j++;
            int subsum = nums[i];
            for(int k = i + 1; k < n;k++){
                subsum += nums[k];
                arr[j] = subsum % m;
                j++;
            }
            
        }
        Arrays.sort(arr);
        int result = 0;
        for(int i = (left-1); i <= (right-1);i++){
            result = (result + arr[i])%m;
        }
        return result%m;
    }
}
