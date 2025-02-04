class problem268 {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        int expSum = n * (n + 1) / 2; 
        int actSum = 0;
        for (int num : nums) {
            actSum += num;
        }
        return expSum - actSum;
    }
    public static void main(String[] args) {
        problem268 solution = new problem268();
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums1)); // Output: 2
        int[] nums2 = {0, 1};
        System.out.println("Missing number: " + solution.missingNumber(nums2)); // Output: 2
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + solution.missingNumber(nums3)); // Output: 8
    }
}
