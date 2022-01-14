// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/12/graphs/codingAssignment/CIRRNK

// You are given the number of vertices(V) and the number of edges(E) of an 
// undirected graph, the task is to print the count of the minimum number of 
// edges that must be removed from the graph to break all of its cycles.

import java.util.*;
  import java.io.*;
  
  public class CIRRNK {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int v = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(e-v+1);
      }
    }
  }