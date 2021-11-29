// Rotate and Find

// We are assuming you have gone through lectures of array rotation 
// till now and you are comfortable with it and you also must have 
// solved good numbers of searching problems. So, we thought why not 
// to combine rotation and searching and create a problem statement for
// you. So you are given a rotated array A and an integer x, your task 
// is to find the index of x. Oh! One more thing. Before you start
// thinking of using linear search let me inform you the array is 
// sorted and rotated. 

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static int findPiv(int l,int r, int[] a){
      if(l>=r)
        return 0;
      int mid = l+(r-l)/2;
      if(mid!=0){
        if(a[mid]<a[mid-1])
          return mid;
        else{
          if(a[0]>a[mid])
            return findPiv(l,mid,a);
          else if(a[a.length-1]<a[mid])
            return findPiv(mid+1,r,a);
        }
      }
      return mid;
    }
    
    public static int binarySearch(int l,int r,int k,int[] a){
      if(l>r)
        return -1;
      
      int mid = l+(r-l)/2;
      if(a[mid]==k){
        return mid;
      }
      else if(a[mid]>k)
        return binarySearch(l,mid,k,a);
      return binarySearch(mid+1,r,k,a);

    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        int k = sc.nextInt();
        int piv = findPiv(0,n-1,a);
        if(a[n-1]<=k)
          System.out.println(binarySearch(0,piv-1,k,a));
        else
          System.out.println(binarySearch(piv,n-1, k,a));
      }
    }
  }