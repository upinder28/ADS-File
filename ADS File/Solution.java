import java.util.*;
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        if (arr.length < 2) {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;  
        List<Integer> resultPair = new ArrayList<>();  
        int maxAbsDiff = 0;  
        while (left < right) {
            int sum = arr[left] + arr[right];  
            if (Math.abs(sum - target) < Math.abs(closestSum - target) || 
                (Math.abs(sum - target) == Math.abs(closestSum - target) && Math.abs(arr[right] - arr[left]) > maxAbsDiff)) {
                closestSum = sum;  
                resultPair = Arrays.asList(arr[left], arr[right]);  
                maxAbsDiff = Math.abs(arr[right] - arr[left]);  
            }
            if (sum < target) {
                left++;  
            } else {
                right--;  
            }
        }
        return resultPair;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 8;
        System.out.println("Pair with sum closest to target " + target1 + ": " + solution.sumClosest(arr1, target1));
        int[] arr2 = {-1, 2, 1, -4};
        int target2 = 1;
        System.out.println("Pair with sum closest to target " + target2 + ": " + solution.sumClosest(arr2, target2));
        int[] arr3 = {1, 2};
        int target3 = 3;
        System.out.println("Pair with sum closest to target " + target3 + ": " + solution.sumClosest(arr3, target3));
    }
}
