class problem27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;  
            }
        }
        return k;
    }
    public static void main(String[] args) {
        problem27 solution = new problem27();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int len1 = solution.removeElement(nums1, val1);
        System.out.println("Length after removing " + val1 + ": " + len1);
        System.out.println("Array after removing " + val1 + ": " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, len1)));
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int len2 = solution.removeElement(nums2, val2);
        System.out.println("Length after removing " + val2 + ": " + len2);
        System.out.println("Array after removing " + val2 + ": " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, len2)));
    }
}
