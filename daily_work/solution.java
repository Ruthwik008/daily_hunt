import java.util.Arrays;

public class solution {

    // ----------------Recursive ----------------
    public static int climbRecursive(int n) {
        if (n <= 2) return n;
        return climbRecursive(n - 1) + climbRecursive(n - 2);
    }

    // ----------------Memoization ----------------
    static int[] dp;

    public static int climbMemo(int n) {
        if (n <= 2) return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = climbMemo(n - 1) + climbMemo(n - 2);
    }

    // ---------------- Bottom-Up ----------------
    public static int climbTabulation(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

 
    public static int climbOptimized(int n) {
        if (n <= 2) return n;

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int n = 5;

        // Recursive
        System.out.println("Recursive: " + climbRecursive(n));

        // Memoization
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Memoization: " + climbMemo(n));

        // Bottom-Up
        System.out.println("Tabulation: " + climbTabulation(n));

        // Space Optimized
        System.out.println("Optimized: " + climbOptimized(n));
    }
}