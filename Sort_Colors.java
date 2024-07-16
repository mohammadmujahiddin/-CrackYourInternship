// 75. Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
class Solution {
    public void sortColors(int[] nums) {
        int rcount = 0;
        int wcount = 0; 
        int bcount = 0;

        for(int i: nums){
            if(i == 0){
                rcount++;
            }else if(i == 1){
                wcount++;
            }else{
                bcount++;
            }
        }
        for(int i = 0;i < nums.length;i ++){
            while(rcount > 0){
                nums[i] = 0;
                i++;
                rcount--;
            }
            while(wcount > 0){
                nums[i] = 1;
                i++;
                wcount--;
            }
            while(bcount > 0){
                nums[i] = 2;
                i++;
                bcount--;
            }
        }
    }
}
  
