package DynamicProgramming.EqualSumPart;
import java.util.*;

// Test case:
// 5 
// 4
// 2 6 14 6
// 4
// 2 6 12 6
// 3
// 1 2 3
// 5 6 9 1 3 5
// 5 
// 1 1 1 1 1

// o/p:
// true
// false
// true
// true
// false

public class EqualSumPartTabulation {
    // boolean dp[][] = new boolean[1001][1001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int sum = 0;
            int a[] = new int[n];
            
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                sum+=a[i];
            }
            
            if(sum%2==0){
                boolean dp[][] = new boolean[n+1][sum/2+1];
                for(int i=0;i<=n;i++)
                    dp[i][0] = true;
                for(int i=1;i<=sum/2;i++)
                    dp[0][i] = false;
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=sum/2;j++){
                        if(a[i-1] > j){
                            dp[i][j] = dp[i-1][j];
                        }
                        else{
                            dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
                        }
                    }
                }
            
                System.out.println(dp[n][sum/2]);
            }
            else
                System.out.println("false");
        }
        sc.close();
    }
}
