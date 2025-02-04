class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        for (final int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }
}
public class problem1413 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {-3, 2, -3, 4, 2};
        System.out.println("Minimum start value for nums1: " + solution.minStartValue(nums1)); // Output: 5
        int[] nums2 = {1, 2};
        System.out.println("Minimum start value for nums2: " + solution.minStartValue(nums2)); // Output: 1
        int[] nums3 = {1, -2, -3};
        System.out.println("Minimum start value for nums3: " + solution.minStartValue(nums3)); // Output: 5
    }
}
