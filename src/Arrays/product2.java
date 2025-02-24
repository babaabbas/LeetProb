package Arrays;//152. Maximum Product Subarray
//Solved
//Medium
//Topics
//Companies
//Given an integer array nums, find a
//subarray
// that has the largest Arrays.product, and return the Arrays.product.
//
//The test cases are generated so that the answer will fit in a 32-bit integer.
//
//
//
//Example 1:
//
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest Arrays.product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


class product2 {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        for(int n:nums){
            res=Math.max(res,n);
        }
        int curmax=1,curmin=1;
        int temp=1;
        for(int i=0;i<nums.length;i++){
            temp=curmax*nums[i];
            curmax=Math.max(temp,Math.max(curmin*nums[i],nums[i]));
            curmin=Math.min(temp,Math.min(curmin*nums[i],nums[i]));
            res=Math.max(res,curmax);
        }
        return res;
    }
}