package Arrays;

import java.util.Arrays;

public class maxsub {
    public static int maxSubArray(int[] nums) {
        int max = nums[0]; // Stores max sum found
        int sum = 0;       // Running sum
        int start = 0, temp_start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
                start = temp_start; // Update start index
                end = i;            // Update end index
            }

            if (sum < 0) { // Reset if sum is negative
                sum = 0;
                temp_start = i + 1; // Start from the next index
            }
        }

        // Print the subarray that gives the max sum
        System.out.println("Max subarray: " + Arrays.toString(Arrays.copyOfRange(nums, start, end + 1)));

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {8, 1, -3, -4, 7};
        System.out.println("Max Sum: " + maxSubArray(arr));
    }
}