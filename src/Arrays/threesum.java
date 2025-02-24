package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {

    public static List<List<Integer>> three(int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }
                else if(total<0){
                    j++;
                }
                else{
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }

            }
        }

        return list;
    }
    public static void main(String[] args){
       List<List<Integer>> list2=new ArrayList<>();
       int[] io={-2,1,4,-6,2,0};
       list2=three(io);
       System.out.println(list2);
    }
}
