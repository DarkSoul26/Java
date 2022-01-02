// You are given an array consisting of N integers. Now you can perform one 
// type of operation on it which is chose any index i and increment ai by 1
// i.e. ai=ai+1. With this operation, you want to maximize the median. Also, 
// you can apply this operation at most K times.The median of the odd-sized 
// array is the middle element after the array is sorted in non-decreasing order.


import java.util.*;
import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int k=sc.nextInt();
            int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
            int mid=(n-1)/2;
           for(int i=n-1;i>=mid+1;i--){
               arr[i]=arr[i]-arr[i-1];
           }
           int i=mid+1;
           int index=mid;
           int count=0;
           while(i<n &&k>(i-mid)*arr[i]){
               k-=(i-mid)*arr[i];
               count+=arr[i];
               index=i;
               i++;
           }
           if(i==n){
               count+=k/(mid+1);
           }
           else{
               count+=k/(index-mid+1);
           }
           System.out.println(count+arr[mid]);
    }
  }