package Arrays;

import java.util.Arrays;

public class maxsub {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        int start=0;
        int temp_start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
                start=temp_start;
                end=i;
            }
            if(sum<0){
                sum=0;
                temp_start=+1;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, start, end+1)));
        return max;
    }
    public static void main(String[] args){
        maxsub m=new maxsub();
        int[] arr={3,1,-3,-4};
        System.out.println(m.maxSubArray(arr));
    }
}
