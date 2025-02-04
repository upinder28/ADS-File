public class problem2256 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        int minDiff = Integer.MAX_VALUE;
        int resultIndex = -1;
        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            int leftAvg = leftSum / (i + 1);
            int rightAvg = (i == n - 1) ? 0 : rightSum / (n - i - 1);
            int avgDiff = Math.abs(leftAvg - rightAvg);
            if (avgDiff < minDiff) {
                minDiff = avgDiff;
                resultIndex = i;
            }
        }
        return resultIndex;
    }
    public static void main(String[] args) {
        problem2256 solution = new problem2256();
        int[] nums1 = {2, 5, 3, 9, 5, 3};
        System.out.println("Index with minimum average difference: " + solution.minimumAverageDifference(nums1)); // Expected output: 3
        int[] nums2 = {0};
        System.out.println("Index with minimum average difference: " + solution.minimumAverageDifference(nums2)); // Expected output: 0
    }
}
