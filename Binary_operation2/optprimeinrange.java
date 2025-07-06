package Binary_operation2;

public class optprimeinrange {
    public static void main(String[] args) {
        int n = 10;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
    }

    // false in array number is prime
    static void seive(int n, boolean[] primes) {
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
