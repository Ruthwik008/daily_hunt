public class knapsack_resursive {

    public static int knapsack(int[] wt, int[] val, int w, int n) {

        // Base case
        if (n == 0 || w == 0)
            return 0;

        // If weight of nth item is less than or equal to capacity
        if (wt[n - 1] <= w) {
            return Math.max(
                    val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1),
                    knapsack(wt, val, w, n - 1)
            );
        }

        // If weight is more than capacity, skip the item
        else {
            return knapsack(wt, val, w, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        System.out.println(knapsack(wt, val, W, n));
    }
}
