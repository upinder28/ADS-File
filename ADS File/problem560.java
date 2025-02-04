import java.util.HashMap;
public class problem560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); 
        int currentSum = 0; 
        int result = 0; 
        for (int num : nums) {
            currentSum += num;
            if (prefixSumCount.containsKey(currentSum - k)) {
                result += prefixSumCount.get(currentSum - k);
            }
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        problem560 solution = new problem560();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(solution.subarraySum(nums1, k1));  // Output: 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2));  // Output: 2
    }
}
