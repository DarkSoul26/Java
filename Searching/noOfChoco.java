// Number of Chocolates

// You are given an array of prices of chocolates. The length of array is 
// N (given). You need to answer q queries. Each query consists of single 
// integer x denoting the amount you have. Now you need to output the number 
// of chocolates you can choose from to buy.

// METHOD 1
import java.util.*;
  import java.io.*;
  public class Main {
    public static int iNeedChoco(int l, int r, int x, int[] a){
      if(l>=r){
        if(a[l]>x)
          return l;
        else if(a[l]==x)
          return l+1;
        return 1;
      }
      int mid = l+(r-l)/2;
      if(mid!=0){
        if(a[mid]>x && a[mid-1]<=x)
          return mid;
        else if(a[mid]<=x){
          return iNeedChoco(mid+1,r,x,a);
        }
        return iNeedChoco(l,mid,x,a);
      }
      return mid;
    }
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      int t = sc.nextInt();
      while(t--!=0){
        int x = sc.nextInt();
        if(x>a[n-1])
          System.out.println(n);
        else{
          int count = iNeedChoco(0,n-1,x,a);
          System.out.println(count);
        }
      }
    }
  }


// METHOD 2

import java.util.*;
  import java.io.*;
  public class Main {
    public static int iNeedChoco(int l, int r, int x, int[] a){
      if(l>=r){
        if(a[l]>x)
          return l;
        else if(a[l]==x)
          return l+1;
        return 1;
      }
      int mid = l+(r-l)/2;
      if(mid!=0){
        if(a[mid]>x && a[mid-1]<=x)
          return mid;
        else if(a[mid]<=x){
          return iNeedChoco(mid+1,r,x,a);
        }
        return iNeedChoco(l,mid,x,a);
      }
      return mid;
    }
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      // Map<Integer, Integer> tm = new TreeMap<>();
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
      Arrays.sort(a);
      int t = sc.nextInt();
      while(t--!=0){
        int x = sc.nextInt();
        if(x>a[n-1])
          System.out.println(n);
        else{
          int count = iNeedChoco(0,n-1,x,a);
          System.out.println(count);
        }
      }
    }
  }