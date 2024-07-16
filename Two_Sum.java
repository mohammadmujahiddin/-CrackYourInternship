// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int result[] = new int[2];
        int count = 0;
        while(i < nums.length){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    result[count] = i;
                    count++;
                    result[count] = j;
                    return result;
                }
            }
            i++;
        }
        return result;
    }
}
