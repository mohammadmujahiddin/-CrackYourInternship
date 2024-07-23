// 18. 4Sum
// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lm=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-4;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<=nums.length-3;j++){
                if(j!=i+1&&nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> il=new ArrayList<>();
                        il.add(nums[i]);
                        il.add(nums[j]);
                        il.add(nums[k]);
                        il.add(nums[l]);
                        lm.add(il);
                        k++;
                        l--;
                        while(k<l&&nums[k]==nums[k-1]) k++;
                        while(k<l&&nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return lm;
    }
}
