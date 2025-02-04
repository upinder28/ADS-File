import java.util.*;
public class PrimeLimit{
    public static List<Integer> findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) primes.add(p);
        }
        return primes;
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Primes up to " + n + ": " + findPrimes(n));
    }
}
