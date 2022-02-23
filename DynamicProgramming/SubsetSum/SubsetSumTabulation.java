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

public class SubsetSumTabulation {
    // boolean dp[][] = new boolean[1001][1001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int a[] = new int[n];
            boolean dp[][] = new boolean[n+1][sum+1];
            for(int i=0;i<=n;i++)
                dp[i][0] = true;
            for(int i=1;i<=sum;i++)
                dp[0][i] = false;
            for(int i = 0;i<n;i++)
                a[i] = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    if(a[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
                    }
                }
            }
            System.out.println(dp[n][sum]);
        }
        sc.close();
    }
}
