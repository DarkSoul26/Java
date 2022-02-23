package DynamicProgramming.SubsetSum;
import java.util.*;
// Test Cases:
// 2
// 4 12
// 2 6 14 6
// 4 81
// 2 6 12 6

// Op:
// true
// false

public class SubsetSumMemo {
    // boolean dp[][] = new boolean[1001][1001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int a[] = new int[n];
            boolean dp[][] = new boolean[n+1][sum+1];
            for(int i = 0;i<n;i++)
                a[i] = sc.nextInt();
            
            System.out.println(subsetSumRec(a, n, sum, dp));
        }
        sc.close();
    }

    private static boolean subsetSumRec(int[] a, int n, int sum, boolean[][] dp) {
        if(sum == 0)
            return true;
        if(n == 0)
            return false;
        if(dp[n][sum])
                return true;
        else{
            if(a[n-1] > sum){
                dp[n][sum] =  subsetSumRec(a, n-1, sum, dp);
            }
            else{
                dp[n][sum] =  subsetSumRec(a, n-1, sum-a[n-1], dp) || subsetSumRec(a,n-1,sum, dp);
            }
        }
        return dp[n][sum];
    }
}
