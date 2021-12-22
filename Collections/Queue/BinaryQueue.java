// PrepBuddy knows that Rahul is good with recursion and struggling with 
// Queue topic, so he gave Rahul a question. Given a number N, print all 
// possible binary numbers with decimal values from 1 to N, but the catch 
// is you have to do this using queue data structure and not recursion. 
// (You have to use the minimum number of bits needed to represent the number).

// Method 1:
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          System.out.print(Integer.toBinaryString(i)+" ");
        }
        System.out.println();
      }
    }
  }

// Method 2:

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        int count = 0;
        while(count!=n){
          String a = q.remove();
          System.out.print(a+" ");
          String temp = a+"0";
          a = a+"1";
          q.add(temp);
          q.add(a);
          count++;
        }
        System.out.println();
      }
    }
  }
