// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/GEMWAR

// You have N warriors and M gems. You can evolve any of your warriors by using 
// X gems.Alternatively, you can kill any of your non-evolved warriors and receive 
// Y gems. You cannot Kill any evolved warrior. Find the maximum number of warriors 
// you can evolve.

import java.util.*;
  import java.io.*;
  
  public class GEMWAR {
    public static void main(String args[]) throws IOException {

      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong();
      long x = sc.nextLong();
      long y = sc.nextLong();
      long count = 0;
      long l = 0, r = n;
      while(l<=r){
        long mid = l+(r-l)/2;
        if(mid*x<=m){
          count = Math.max(mid,count);
          l = mid+1;
        }
        else if(mid*x>m){
          long rem = n-mid;
          long m1 = m+rem*y;
          if(m1>=mid*x){
            count = Math.max(mid,count);
            l = mid+1;
          }
          else
            r = mid-1;
        }
      }
      System.out.println(count);
      sc.close();
    }
  }