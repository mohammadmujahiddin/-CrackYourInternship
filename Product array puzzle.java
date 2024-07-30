Product array puzzle
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long product = 1;
        int zero = 0;
        long res[] = new long[n];
        for(int i: nums){
            if(i == 0){
                zero++ ;
                continue;
            }
            product *= (long)i;
        }
        for(int i = 0;i < n;i++){
            if(nums[i] == 0 && zero == 1) {
                res[i] = product;
                continue;
            }
            
            if(zero > 1) {
                res[i] = 0;
            }else if(zero == 0){
                res[i] = product/nums[i];
            }
            
        }
        return res;
	} 
} 
