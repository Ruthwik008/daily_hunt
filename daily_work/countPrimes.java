class Solution {
    public int countPrimes(int n) {

        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        // assume all numbers from 2 to n-1 are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // sieve
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}