class Solution {// note here the class name is not same as file name because is it was public the class name n file name should have been same 

    public static boolean isSubsetSum(int[] arr, int n, int sum) {

        // Base cases
        if (sum == 0) return true;
        if (n == 0) return false;

        // If current element is greater than sum, ignore it
        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);

        // Include or exclude the element
        return isSubsetSum(arr, n - 1, sum - arr[n - 1]) ||
               isSubsetSum(arr, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;

        System.out.println(isSubsetSum(arr, arr.length, sum));
    }
}
