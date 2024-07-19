// 442. Find All Duplicates in an Array
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant extra space.

  
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> track = new HashMap<>();

        for(int i: nums){
            if(track.containsKey(i)){
                result.add(i);
            }else{
                track.put(i,1);
            }
        }
        return result;
    }
}
