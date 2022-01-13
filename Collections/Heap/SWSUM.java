Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/11/heaps/codingAssignment/SWSUM

import java.util.*;
  import java.io.*;
  
  public class SWSUM {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int s = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      int maxSum = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
          Queue<Integer> q1 = new PriorityQueue<>();
          Queue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
          // for(int l=i;l<=j;l++)
          //   q1.add(a[l]);
          // for(int l=j+1;l<n;l++)
          //   q2.add(a[l]);
          for(int l = 0;l<n;l++){
            if(l>=i && l<=j)
              q1.add(a[l]);
            else
              q2.add(a[l]);
          }
          int k = s;
          while(k!=0){
            if(q1.isEmpty() || q2.isEmpty())
                break;
            else if(q1.peek()>=q2.peek())
              break;
            else{
              int x1 = q1.remove();
              int x2 = q2.remove();
              q1.add(x2);
              k--;
            }
          }
          Iterator value = q1.iterator();
          int sum = 0;
          while (value.hasNext()) {
              sum+=(int)value.next();
          }
          if(sum>maxSum)
            maxSum = sum;
        }
      }
      System.out.println(maxSum);
    }
  }