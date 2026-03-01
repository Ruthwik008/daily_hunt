import java.util.Arrays;

public class cs_memoization {

    static Integer[][] dp;

    public static int countSubsets(int[] arr, int n, int sum) {

        if (sum == 0) return 1;
        if (n == 0) return 0;

        if (dp[n][sum] != null)
            return dp[n][sum];

        if (arr[n - 1] > sum)
            return dp[n][sum] = countSubsets(arr, n - 1, sum);

        return dp[n][sum] =
                countSubsets(arr, n - 1, sum - arr[n - 1]) +
                countSubsets(arr, n - 1, sum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;

        dp = new Integer[arr.length + 1][sum + 1];

        System.out.println(countSubsets(arr, arr.length, sum));
    }
}