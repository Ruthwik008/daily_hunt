class Solution {

    public static int countSubsets(int[] arr, int n, int sum) {

        // Base cases
        if (sum == 0) return 1;   // found one subset
        if (n == 0) return 0;     // no elements left

        if (arr[n - 1] > sum)
            return countSubsets(arr, n - 1, sum);

        return countSubsets(arr, n - 1, sum - arr[n - 1]) +   // include the last element + exclude the last element what happeends if we include and if we dont include 
               countSubsets(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;

        System.out.println(countSubsets(arr, arr.length, sum));
    }
}
