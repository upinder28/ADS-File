public class problem724 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; 
    }
    public static void main(String[] args) {
        problem724 problem = new problem724();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index for nums1: " + problem.pivotIndex(nums1)); // Output: 3
        int[] nums2 = {1, 2, 3};
        System.out.println("Pivot index for nums2: " + problem.pivotIndex(nums2)); // Output: -1
        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot index for nums3: " + problem.pivotIndex(nums3)); // Output: 0
    }
}
