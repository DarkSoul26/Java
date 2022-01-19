// Question Link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/12/graphs/codingAssignment/GRISTR

// There is a Boy, who always look towards the Sky. One day he saw that a Graph is falling 
// from the Sky. That Graph contains some information like N, the Number of Vertices in the 
// Graph and the Degree of each Vertex.Now, the Boy has to tell that whether the Graph is a 
// Tree or Not. As he is not good in Data Structures, so he wants your help in identifying 
// the Graph.

// If we take the sum of all the degrees, each edge will be counted twice. Hence, for a tree 
// with n vertices and n – 1 edges, sum of all degrees should be 2 * (n – 1).

import java.util.*;
  import java.io.*;
  
  public class GRISTR {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      boolean flag = true;
      int x = v;
      int sum = 0;
      while(x--!=0){
        sum+=sc.nextInt();
      }
      if(sum>2*(v-1))
        System.out.println("No");
      else
        System.out.println("Yes");
    }
  }