public class Problem1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0; 
        int currAltitude = 0; 
        for (final int g : gain) {
            currAltitude += g;  
            ans = Math.max(ans, currAltitude);  
        }
        return ans;  
    }
    public static void main(String[] args) {
        Problem1732 solution = new Problem1732();
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Largest altitude for gain1: " + solution.largestAltitude(gain1)); // Expected output: 1
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Largest altitude for gain2: " + solution.largestAltitude(gain2)); // Expected output: 4
    }
}
