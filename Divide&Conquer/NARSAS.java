// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/NARSAS

// Naruto and Sasuke are two Anime characters who have their power levels as A and B. 
// They got into some fight and the only way to stop their fight is to make their power 
// level equal.You love both the characters and don't want them to fight. You have K 
// gems. Each gem can increase the power of Naruto by X and the power of Sasuke by Y.
// Your goal is to spend all the gems and bring the power of both the characters to 
// the same level.

import java.util.*;
  import java.io.*;
  
  public class NARSAS {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int l = 0, r = k;
      int ans = -1;
      while(l<=r){
        int mid = l+(r-l)/2;
        int a1 = a+mid*x;
        int b1 = b+(k-mid)*y;
        if(a1 == b1){
          ans = mid;
          break;
        }
        else if(a1>b1){
          r = mid-1;
        }
        else{
          l = mid+1;
        }
      }
      System.out.println(ans);
      sc.close();
    }
  }