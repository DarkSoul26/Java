// Arranging the Stones

// Rahul and Tina have collected a few stones. They are given an array and are asked
// to arrange the stones in an array according to their weights. Tina is given the
// first half of the array and she arranges weight of stones in increasing order and
// Rahul does the same task for his stones in 2nd half of the array. Now PrepBuddy
// wants you to completely sort this array from start to end containing weight of
// stones placed.

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
          
        int n1 = (int)Math.ceil((double)n/2);
        int n2 = n-n1;
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        
        for(int i=0;i<n1;i++)
          a1[i] = a[i];
        for(int i=0;i<n2;i++)
          a2[i] = a[n1+i];
        
        int i = 0,j = 0, k = 0;
        while(i<n1 && j<n2){
          if(a1[i]<a2[j])
            a[k++] = a1[i++];
          else
            a[k++] = a2[j++];
        }
        
        while(i<n1)
          a[k++] = a1[i++];
        while(j<n2)
          a[k++] = a2[j++];
          
        for(i = 0;i<n;i++)
          System.out.print(a[i]+" ");
        System.out.println();
      }
    }
  }