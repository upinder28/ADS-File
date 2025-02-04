import java.util.HashSet;
class problem217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        problem217 solution = new problem217(); 
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Test case 1: " + solution.containsDuplicate(nums1));  // Output: true
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: " + solution.containsDuplicate(nums2));  // Output: false
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test case 3: " + solution.containsDuplicate(nums3));  // Output: true
    }
}
