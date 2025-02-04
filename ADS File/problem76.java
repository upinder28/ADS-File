import java.util.HashMap;

class problem76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";  
        }
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0; 
        int matched = 0;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);
            if (windowMap.get(rightChar).equals(targetMap.get(rightChar))) {
                matched++;
            }
            while (matched == targetMap.size() && left <= right) {
                char leftChar = s.charAt(left);
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (windowMap.get(leftChar) < targetMap.getOrDefault(leftChar, 0)) {
                    matched--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        problem76 solution = new problem76();  
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Minimum window: " + solution.minWindow(s1, t1));  // Output: "BANC"
        String s2 = "a";
        String t2 = "a";
        System.out.println("Minimum window: " + solution.minWindow(s2, t2));  // Output: "a"
        String s3 = "a";
        String t3 = "aa";
        System.out.println("Minimum window: " + solution.minWindow(s3, t3));  // Output: ""
    }
}
