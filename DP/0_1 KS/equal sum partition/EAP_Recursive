class Solution {

    public static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;

        if (sum % 2 != 0) return false;

        return isSubsetSum(arr, arr.length, sum / 2);
    }

    private static boolean isSubsetSum(int[] arr, int n, int sum) {

        if (sum == 0) return true;
        if (n == 0) return false;

        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);

        return isSubsetSum(arr, n - 1, sum - arr[n - 1]) ||
               isSubsetSum(arr, n - 1, sum);
    }
}
