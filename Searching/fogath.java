// PrepBuddy has bought N magical ropes. Now, what is magical about the ropes? So, 
// each rope has some initial length which is shared with you in the form of an 
// array H and each rope grows at a certain rate every day. The rate of growth of 
// each rope per day is again given to you in an array R. PrepBuddy has given you 
// the task to collect ropes that sum up to length X meters. But there are some 
// restrictions.You cannot cut the rope, you have to take complete rope for collecting 
// it. You cannot take a rope with length less than K meters. Your task is to find 
// out the minimum number of days PrepBuddy should wait in order to collect the ropes 
// that sum up to lengt X meters.

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long x = sc.nextLong();
      long k = sc.nextLong();
      long a[] = new long[n];
      long b[] = new long[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextLong();
      for(int i=0;i<n;i++)
        b[i] = sc.nextLong();
      long sum = 0;
      
      long l = 0, r  = 1000000000000000000L;
      long mid = 0;
      long min_Days = 0;
      while(l<=r){
        mid = l+(r-l)/2;
        boolean flag = false;
        long temp = -1;
        for(int i=0;i<n;i++){
          if(a[i]+mid*b[i]>=k){
            sum += a[i]+mid*b[i];
            if(sum>=x){
              flag = true;
              break;
            }
          }
        }
        if(flag){
          r = mid-1;
          min_Days = mid;
        }
        else
          l = mid+1;
        sum = 0;
      }
      System.out.println(min_Days);
    }
  }