// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/SQUARERT

// PrepBuddy is given a number n. Help him find the square root of the number, 
// the square root might be in decimal so find the floor of the square root.

import java.util.*;
  import java.io.*;
  
  public class SQUARERT {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        long n = sc.nextLong();
        long l = 0;
        long r = n;
        long ans = -1;
        if(n == 0 || n == 1)
          System.out.println(n);
        else{
          while(l<=r){
            long mid = l+(r-l)/2;
            long pow = mid*mid;
            if(pow==n){
              ans = mid;
              break;
            }
            else if(pow<n){
              l = mid+1;
              ans = mid;
            }
            else
              r = mid-1;
          }
          System.out.println(ans);
        }
      }
      sc.close();
    }
  }