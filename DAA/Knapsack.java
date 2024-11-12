import java.util.*;
public class Knapsack {
    public static int knapsack(int capacity, int[] values, int[] weights, int n){
        int dp[][] = new int[n + 1][capacity + 1];

        for(int i=0; i<=n; i++){
            for(int w=0; w<=capacity; w++) {

                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity];
    }

    public static void main(String[] args){
        int values[] = {1,2,3};
        int weights[] = {4,5,1};
        int capacity = 4;
        int n = values.length;

        int maxprofit = knapsack(capacity, values,weights,n);
        System.out.println("Maxprofit is : " +maxprofit);
    }
}
