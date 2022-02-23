package DynamicProgramming;

import java.util.*;
  import java.io.*;
  
  public class FIBONO {
    public static long fibo(int n, long[] dp){
      if(n == 0 || n == 1){
        dp[n] = n;
        return n;
      }
      if(dp[n]!=-1)
        return dp[n];
      dp[n] = fibo(n-1, dp)+fibo(n-2,dp);
      return dp[n];
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long dp[] = new long[n+1];
      Arrays.fill(dp, -1);
      System.out.println(fibo(n, dp));
      sc.close();
    }
  }