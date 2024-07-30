628. Maximum Product of Three Numbers
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int result = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int m1 = nums[n-1]*nums[n-2]*nums[n-3];
        int m2 = nums[0]*nums[1]*nums[2];
        int m3 = nums[0]*nums[1]*nums[n-1];
        result = Math.max(m1,m2);
        result = Math.max(result,m3);
        return result;
    }
}
