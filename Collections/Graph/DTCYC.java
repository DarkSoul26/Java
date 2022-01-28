// Question link: https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/12/graphs/codingAssignment/DTCYC

// Given an undirected graph, print Yes if a cycle is present in the graph else
//  print No.

import java.util.*;
  import java.io.*;
  public class DTCYC {
    
    public static void main(String args[]) throws IOException {
      
      Scanner sc = new Scanner(System.in);
      // int t = sc.nextInt();
      // while(t--!=0){
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        int count = 0;
        for(int i=0;i<nodes;i++){
          adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges;i++){
          int u = sc.nextInt();
          int v = sc.nextInt();
          adj.get(u).add(v);
          adj.get(v).add(u);
        }
        if(isCyclic(adj, nodes)){
          System.out.println("Yes");
        }
        else{
          
          System.out.println("No");
        }
      // }
      
      
    }
    static boolean isCyclic(List<List<Integer>> adj, int nodes){
        boolean visited[] = new boolean[nodes];
        for(int i=0;i<nodes;i++){
          if(!visited[0] && isCyclicConnected(adj,0,nodes,visited)){
            return true;
          }
        }
        for (int u = 0; u < nodes; u++)
            if (!visited[u])
                return true;
        return false;
      }
      
      static boolean isCyclicConnected(List<List<Integer>> adj, int s, int nodes, boolean[] visited){
      int parent[] = new int[nodes];
      Arrays.fill(parent, -1);
      Queue<Integer> q = new LinkedList<>();
      visited[s]= true;
      q.add(s);
      while(!q.isEmpty()){
        int u = q.poll();
        for(int i=0;i<adj.get(u).size();i++){
          int v = adj.get(u).get(i);
          // if(adjMat[)
          if(!visited[v]){
            visited[v] = true;
            q.add(v);
            parent[v] = u;
          }
          else if(parent[u]!=v)
            return true;
        }
      }
      return false;
    }
  }