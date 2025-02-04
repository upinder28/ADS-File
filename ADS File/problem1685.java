public class problem1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        final int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum += Math.abs(nums[i] - nums[j]);
                }
            }
            result[i] = sum;
        }
        return result;
    }
    public static void main(String[] args) {
        problem1685 solution = new problem1685();
        int[] nums1 = {2, 3, 5};
        int[] result1 = solution.getSumAbsoluteDifferences(nums1);
        System.out.println("Result for nums1: " + java.util.Arrays.toString(result1));  // Output: [4, 3, 5]
        int[] nums2 = {1, 4, 6, 8, 10};
        int[] result2 = solution.getSumAbsoluteDifferences(nums2);
        System.out.println("Result for nums2: " + java.util.Arrays.toString(result2));  // Output: [24, 15, 13, 15, 21]
    }
}
