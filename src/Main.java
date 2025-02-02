//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(nums[i],i);

        }

        return new int[] {0};
    }
}


//HashMap is used to store key,value pair data
//HashMap initialization HashMap<Integer,Integer> mp=new HashMap<>();
//mp.put("key","value");
//mp.containsKey("key"); <to check whether key exists>
//mp.get("key"); <to get the value>
