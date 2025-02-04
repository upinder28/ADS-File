import java.util.*;
class problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;  
        }
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS); 
        Arrays.sort(arrT);
        return Arrays.equals(arrS, arrT);
    }
    public static void main(String[] args) {
        problem242 solution = new problem242();
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Are the strings anagrams for example 1? " + solution.isAnagram(s1, t1));  
        
        String s2 = "rat";
        String t2 = "car";
        System.out.println("Are the strings anagrams for example 2? " + solution.isAnagram(s2, t2));  
    }
}
