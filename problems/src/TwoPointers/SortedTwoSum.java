package TwoPointers;

import java.util.Arrays;

public class SortedTwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));    // [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 5}, 6)));      // [0, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{-3, -1, 0, 2, 5}, 2))); // [0, 4]
    }

    static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}