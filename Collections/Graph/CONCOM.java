// Question Link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/12/graphs/codingAssignment/CONCOM

// Given an undirected graph, count the number of connected components.

//Count using DFS appraoch

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
  // public int count = 0;
  class Graph{
    int numNodes;
    int[][] adjMat;
    Node[] nodeL;
    // int maxNode;
    // Queue <Integer> q;
    
    Graph(int size){
      numNodes = 0;
      adjMat = new int[size][size];
      nodeL = new Node[size];
      // q = new Queue<>();
    }
    
    void addNode(int el){
      nodeL[this.numNodes++] = new Node(el);
    }
    
    void addEdge(int s, int e){
      adjMat[s][e] = 1;
      adjMat[e][s] = 1;
    }
    
    private void printNode(int ind){
      System.out.println(nodeL[ind]);
    }
    
    int getAdjUnN(int node){
      for(int i = 0;i<this.numNodes;i++){
        if(adjMat[node][i] == 1 && !nodeL[i].visited)
          return i;
      }
      return -1;
    }
    
    // void bfs(){
    //   nodeL[0].visited = true;
    //   System.out.println(nodeL[0].val);
        
    //   q.enqueue(0);
    //   int n1;
    //   while(!q.isEmpty()){
    //     int n2 = q.dequeue();
    //     while(n1 = getAdjUnN(n2)!=-1){
    //       nodeL[n1].visited = true;
    //       printNode(n1);
    //       q.enqueue(n1);
    //     }
    //   }
    // }
    
    void dfs(int n){
      nodeL[n].visited = true;
    //   System.out.println(nodeL[n].val);
        
      // q.enqueue(0);
       int n1;
      // while(!q.isEmpty()){
      //   int n2 = q.dequeue();
        while((n1 = getAdjUnN(n))!=-1){
          dfs(n1);
        }
      // }
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
  public class Main {
    
    public static void main(String args[]) throws IOException {
      
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--!=0){
        int v = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(v);
        for(int i=0;i<v;i++)
          g.addNode(i);
        for(int i=0;i<e;i++){
          g.addEdge(sc.nextInt(),sc.nextInt());
        }
        System.out.println(g.dft());
        
      }
      
    }
  }