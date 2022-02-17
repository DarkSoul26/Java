// Test case:

// 7 12
// 0 1 1
// 0 2 4
// 1 2 3
// 2 3 5
// 1 3 7
// 1 4 6
// 2 5 2
// 3 4 10
// 3 5 8
// 4 5 3
// 4 6 9
// 5 6 11

import java.util.*;
public class KruskalsAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();
        List<Edge> graph = new ArrayList<>();
        for(int i = 0; i < e; i++){
            System.out.print("Enter the edge: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int wt = sc.nextInt();
            graph.add(new Edge(a, b, wt));
        }
        List<Edge> res = kruskalsAlgo(graph, n);
        for(Edge el : res){
            System.out.println(el.u+" to "+el.v+" with weight: "+el.wt);
        }
        sc.close();
    }

    private static List<Edge> kruskalsAlgo(List<Edge> graph, int n) {
        int vert[] = new int[n];
        for(int i=0;i<n;i++)
            vert[i] = i;
        
        Collections.sort(graph, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.wt - o2.wt;
            }
        });

        List<Edge> res = new ArrayList<>();
        int c = 0, i = 0;

        //Union find Algorithm
        while(c<n-1){
            Edge e = graph.get(i);
            int u1 = find(vert, e.u);
            int v1 = find(vert, e.v);

            if(u1 != v1){
                res.add(e);
                vert[v1] = u1;
                c++;
            }
            i++;
        }
        return res;
    }

    //Find the parent of the node
    private static int find(int[] vert, int u) {
        if(u == vert[u])
            return u;
        return find(vert, vert[u]);
    }
}

class Edge{
    int u;
    int v;
    int wt;
    Edge(int u, int v, int wt){
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}
