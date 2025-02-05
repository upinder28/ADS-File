public class taskAds {
    public static void main(String[] args) {
        String s = "Neeraj123@!";
        int upper = 0, lower = 0,special = 0;
       
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else {
                special++;
            }
        }
        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Lowercase Letters: " + lower);
        System.out.println("Special Characters: " + special);
    }
}
