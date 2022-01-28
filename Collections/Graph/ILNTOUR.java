// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/12/graphs/codingAssignment/ILNTOUR

// There are N islands in an ocean, numbered from 1 to N. Some islands are connected
// by roads between them. Initially, you are on the island 1 and you want to visit 
// all the islands. If two islands are connected you don't have to spend any money 
// on going from one to another else you have to pay 1 unit of money to reach another. 
// What is the minimum amount of money you have to pay to visit all the islands?   

import java.util.*;
  import java.io.*;
  
  class Node{
    int val;
    boolean visited;
    
    Node(int val){
      this.val = val;
      this.visited = false;
    }
  }

  class Graph{
    int numNodes;
    int[][] adjMat;
    Node[] nodeL;
    
    Graph(int size){
      numNodes = 0;
      adjMat = new int[size][size];
      nodeL = new Node[size];
    }
    
    void addNode(int el){
      nodeL[this.numNodes++] = new Node(el);
    }
    
    void addEdge(int s, int e){
      adjMat[s][e] = 1;
      adjMat[e][s] = 1;
    }
    
    int getAdjUnN(int node){
      for(int i = 0;i<this.numNodes;i++){
        if(adjMat[node][i] == 1 && !nodeL[i].visited)
          return i;
      }
      return -1;
    }

    void dfs(int n){
      nodeL[n].visited = true;
       int n1;
        while((n1 = getAdjUnN(n))!=-1){
          dfs(n1);
        }
    }
    
    int dft(){
      int count = 0;
      for(int i=0;i<numNodes;i++){
        if(!nodeL[i].visited){
          dfs(i);
          count++;
        }
      }
      return count;
    }
  }
  public class ILNTOUR{
    
    public static void main(String args[]) throws IOException {
      
      Scanner sc = new Scanner(System.in);
      int v = sc.nextInt();
      int e = sc.nextInt();
      Graph g = new Graph(v);
      for(int i=0;i<v;i++)
        g.addNode(i);
      for(int i=0;i<e;i++){
        int u1 = sc.nextInt()-1;
        int v1 = sc.nextInt()-1;
        
        g.addEdge(u1,v1);
      }
      System.out.println(g.dft()-1);
      
    }
  }