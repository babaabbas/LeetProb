import java.util.HashMap;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//Example 1:
//
//Input: nums = [1,2,3,1]
//
//Output: true
//
//Explanation:
//
//The element 1 occurs at the indices 0 and 3.
class duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        duplicate d=new duplicate();
        int[] arr={1,2,1,4};
        System.out.println(d.containsDuplicate(arr));

    }
}

