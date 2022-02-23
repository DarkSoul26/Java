package DynamicProgramming.LongestCommonSubsequence;
import java.util.*;

// Test cases:

// 4
// abcdef
// bxcrdlf
// aaaaa
// a
// a
// a
// abc
// xrt

// o/p
// 4
// 1
// 1
// 0

public class LCSMemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n = s1.length();
            int m = s2.length();
            int dp[][] = new int[n+1][m+1];
            for(int[] dp1: dp)
                Arrays.fill(dp1, -1);
            // for(int i=0;i<n;i++)
            //     dp[i][0] = 0;
            // for(int j=0;j<m;j++)
            //     dp[0][j] = 0;
            System.out.println(lcs(s1,s2,n,m,dp));
        }
        sc.close();
    }

    private static int lcs(String s1, String s2, int n, int m, int dp[][]) {
        if(n == 0 || m == 0)
            return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(s1.charAt(n-1) == s2.charAt(m-1))
            dp[n][m] = 1+lcs(s1,s2, n-1, m-1,dp);
        else    
            dp[n][m] = Math.max(lcs(s1,s2,n-1,m,dp), lcs(s1,s2,n,m-1,dp));
        return dp[n][m];
    }
}
