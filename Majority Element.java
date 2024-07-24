169. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> hm = new HashMap<>();
       int n = nums.length;
       for(int i = 0;i < n;i++){
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
            if(hm.get(nums[i]) > n/2) return nums[i];
        }else{
            hm.put(nums[i],1);
        }
       } 
       return nums[0];
    }
}
