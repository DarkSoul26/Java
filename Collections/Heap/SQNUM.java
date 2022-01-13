// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/11/heaps/codingAssignment/SQNUM


import java.util.*;
  import java.io.*;
  
  public class SQNUM {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        Queue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
          pq.add(sc.nextLong());
        for(int i=0;i<n-1;i++){
          long p = pq.remove();
          long q = pq.remove();
          long addIt = ((p*3)%(1000000007)-(q*2)%(1000000007))%(1000000007);
          pq.add(addIt);
        }
        System.out.println(pq.remove());
      }
    }
  }