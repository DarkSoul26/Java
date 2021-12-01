// STOCK MARKET

// If you have to make money, go to the stock market and if you have to lose
// money then also go to the stock market. Tina recently read this line and
// she wants to make money so she goes to the stock market. In the stock market,
// you buy and sell a stock. Now, she is given a list of price predictions of
// stock for next few days and since she is a computer programmer she wants to
// use her coding skills to find out what could be the maximum profit she could
// make out of given stock prices. There are a few rules she has to follow : A new
// transaction can only start after the previous transaction is complete. i.e.
// we can only hold at-most one share at a time. We are allowed to make unlimited
// stock transactions.

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        long count = 0;
        for(int i=1;i<n;i++){
          if(a[i]>a[i-1])
            count+=a[i]-a[i-1];
        }
        System.out.println(count);
      }
    }
  }