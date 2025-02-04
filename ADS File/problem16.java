import java.util.Arrays;
class problem16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1; 
            int right = nums.length - 1;  
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                }
                else if (currentSum > target) {
                    right--;
                }
                else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        problem16 solution = new problem16();  
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest sum for nums1: " + solution.threeSumClosest(nums1, target1));  // Output: 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest sum for nums2: " + solution.threeSumClosest(nums2, target2));  // Output: 0
        int[] nums3 = {1, 1, 1, 1};
        int target3 = 3;
        System.out.println("Closest sum for nums3: " + solution.threeSumClosest(nums3, target3));  // Output: 3
    }
}
