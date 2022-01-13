// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/11/heaps/codingAssignment/LXSM

// Tina's grandfather gifted her a tressure box which can only be opened by 
// entering a string say S formed by another string say str written on top of 
// the box with an integer q. Tina can get the required string S by performing 
// following operations on the string str Take any character from the first q 
// characters of str and append it to S.Remove the chosen character from str.
// Repeat the above steps while there are characters left in str. Tressure box
// will open only if the string S formed is lexicographically smallest possible. 
// Help Tina in forming such a string.
// Note - Use heap concepts to solve the problem.

import java.util.*;
import java.io.*;
  
  public class LXSM {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        String s = sc.next();
        int k = sc.nextInt();
        Queue<Character> q = new PriorityQueue<>();
        int i = 0;
        for(i=0;i<k;i++)
          q.add(s.charAt(i));
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
          sb.append(q.remove());
          if(i<s.length()){
            q.add(s.charAt(i));
            i++;
          }
        }
        System.out.println(sb);
      }
    }
  }