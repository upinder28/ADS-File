class problem26 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;  
            }
        }
        return k;
    }
    public static void main(String[] args) {
        problem26 solution = new problem26();
        int[] nums1 = {1, 1, 2};
        int len1 = solution.removeDuplicates(nums1);
        System.out.println("Length after removing duplicates: " + len1);
        System.out.println("Array after removing duplicates: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, len1)));
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = solution.removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + len2);
        System.out.println("Array after removing duplicates: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, len2)));
    }
}
