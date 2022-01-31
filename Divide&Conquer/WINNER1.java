// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/codingAssignment/WINNER1

// You are given a number A. There are i persons in the room. Every person handshakes 
// with the other and the emotion generated is i∗j, where the ids are i and j. i 
// handshaking with j is different from j handshakes with i. Now the total emotion 
// was the square of the sum of ids of all persons from 1 to i. The emotion 
// generated is emotion lost. Now Arnab states that the maximum emotion that 
// should be left after the party should be less than or equal to A.Find the 
// largest value of i possible.

import java.util.*;
  import java.io.*;
  
  public class WINNER1 {
    static long win(long n){
      if(n==1) return n;
      return n*n + win(n-1);
    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0){
        t-=1;
        long n=sc.nextLong();
        long count=0;
        long i=0;
        int flag=0;
        while(count<n){
          count+=i*i;
          
          if(count>n){flag=1; break;}
          if(count==n) break;
          i+=1;
        }
        if(flag==0)
        System.out.println(i);
        else
        System.out.println(i-1);
      }
      
    }
}