

class Solution {

    static Boolean[][] dp;

    public static boolean isSubsetSum(int[] arr, int n, int sum) {

        if (sum == 0) return true;
        if (n == 0) return false;

        if (dp[n][sum] != null)
            return dp[n][sum];

        if (arr[n - 1] > sum)
            return dp[n][sum] = isSubsetSum(arr, n - 1, sum);

        return dp[n][sum] =
                isSubsetSum(arr, n - 1, sum - arr[n - 1]) ||
                isSubsetSum(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;
        int n = arr.length;

        dp = new Boolean[n + 1][sum + 1];

        System.out.println(isSubsetSum(arr, n, sum));
    }
}
