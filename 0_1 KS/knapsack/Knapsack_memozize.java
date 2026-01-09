import java.util.Arrays;

public class Knapsack_memozize {

    static int[][] dp = new int[1002][1002];

    // Knapsack function
    public static int knapsack(int[] wt, int[] val, int w, int n) {

        // Base condition
        if (n == 0 || w == 0)
            return 0;

        // If already computed
        if (dp[n][w] != -1)
            return dp[n][w];

        // If weight of nth item is less than or equal to capacity
        if (wt[n - 1] <= w) {
            return dp[n][w] = Math.max(
                    val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1),
                    knapsack(wt, val, w, n - 1)
            );
        }

        // If weight is greater than capacity
        else {
            return dp[n][w] = knapsack(wt, val, w, n - 1);
        }
    }

    public static void main(String[] args) {

        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        // Initialize dp array with -1
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(knapsack(wt, val, W, n));
    }
}
