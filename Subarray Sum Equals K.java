// 560. Subarray Sum Equals K
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumF = new HashMap<>();
        sumF.put(0,1);

        int csum = 0;
        int count = 0;

        for(int num: nums){
            csum += num;

            if(sumF.containsKey(csum - k)){
                count += sumF.get(csum - k);
            }
            sumF.put(csum, sumF.getOrDefault(csum, 0)+1);
        }
        return count;
    }
}
