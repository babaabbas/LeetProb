package Arrays;

public class watercontaier {
    public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            max=Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return max;

    }
    public static void main(String[] args){
        int[] cool={1,8,6,2,5,4,8,3,8};
        System.out.println(maxArea(cool));

    }
}
