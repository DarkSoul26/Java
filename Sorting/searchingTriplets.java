// PrepBud has an array of integers. She was going through the numbers of the
// array and suddenly she realized there exist triplets in the array such that 
// the sum of two elements equals the third element(not particularly in any order). 
// She created a problem statement for you out of this situation. Given an array of 
// distinct integers find out a triplet that satisfies the given condition.

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        boolean flag = false;
        Arrays.sort(a);
        int i=0;
        int j=n-2;
        int k = n-1;
        while(true){
          
          if(k==1)
            break;
          while(i<j){
            if(a[k]>a[i]+a[j]){
              i++;
            }
            else if(a[k]<a[i]+a[j])
              j--;
            else{
              System.out.println(a[k]+" "+a[i]+" "+a[j]);
              flag = true;
              break;
            }
          }
          if(flag)
            break;
          i = 0;
          j = k-2;
          k--;
        }
        if(!flag)
          System.out.println(-1);
      }
    }
}