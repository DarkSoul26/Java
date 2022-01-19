// You are given an array of N integers. You have to make the given array into a 
// zigzag array. During converting given array into a zigzag array you can perform 
// a move, which consists of choosing any element and decreasing it by 1.An array 
// A is a zigzag array if either:1. Every even-indexed element is greater than 
// adjacent elements, ie. A[0]>A[1]<A[2]>A[3]<A[4]>...2. OR, every odd-indexed 
// element is greater than adjacent elements, ie A[0]<A[1]>A[2]<A[3]>A[4]<...Print 
// the minimum number of moves to transform the given array into a zigzag array.

import java.util.*;
  import java.io.*;
  
  public class ARRZIGZAG {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      int s1 = 0, s2 = 0;
      for(int i=0;i<n;i+=2){
        if(i==0)
          s1+=a[i]-Math.min(a[i],a[i+1]-1);
        else if(i==n-1)
          s1+=a[i]-Math.min(a[i],a[i-1]-1);
        else
          s1+=a[i]-Math.min(a[i],Math.min(a[i-1]-1,a[i+1]-1));
      }
      for(int i=1;i<n;i+=2){
        if(i==n-1)
          s2+=a[i]-Math.min(a[i],a[i-1]-1);
        else
          s2+=a[i]-Math.min(a[i],Math.min(a[i-1]-1,a[i+1]-1));
      }
      System.out.println(Math.min(s1,s2));
      
    }
  }