// Question link: https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/MAXIMUM 

// Abishek always participates in competitive programming because he enjoys
// solving competitive programming questions. PrepBuddy organizes a coding 
// competition and announces a big price for the winner. He gave an array and 
// asked to find the maximum difference between indexes (j–i) such that 
// arr[j]>arr[i]where j>i. Abhishek is not able to solve this problem, but he 
// wants to win this competitive programming. So he is asking for help.

import java.util.*;
import java.io.*;

public class MAXIMUM {
  static int max = -1;
  public static void checkIt(int a[], int i, int j){
    if(j<=i)
      return;
    if(a[i]<a[j]){
      if(max<j-i)
        max = j-i;
      return;
    }
    checkIt(a, i+1, j);
    checkIt(a,i,j-1);
  }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    // int max = Integer.MIN_VALUE;
    
    checkIt(a,0,n-1);
    System.out.println(max);
  }
}