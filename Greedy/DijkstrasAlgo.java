// Test case 1:

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
// Shortest distance from 0 to 0: 0
// Shortest distance from 0 to 1: 1
// Shortest distance from 0 to 2: 4
// Shortest distance from 0 to 3: 8
// Shortest distance from 0 to 4: 7
// Shortest distance from 0 to 5: 6
// Shortest distance from 0 to 6: 17

// Test case 2:

// 7 9
// 2 3 2
// 1 6 4
// 1 2 6
// 3 6 8
// 0 5 10
// 3 4 12
// 4 6 14
// 0 1 18
// 4 5 15
// Shortest distance from 0 to 0: 0
// Shortest distance from 0 to 1: 18
// Shortest distance from 0 to 2: 24
// Shortest distance from 0 to 3: 26
// Shortest distance from 0 to 4: 25
// Shortest distance from 0 to 5: 10
// Shortest distance from 0 to 6: 22

//Test Case 3:

// 7 12
// 0 1 3
// 0 2 5
// 1 2 4
// 2 3 1
// 1 5 2
// 1 4 7
// 2 4 9
// 3 4 5
// 3 5 6
// 4 5 8
// 5 6 3
// 3 6 2
// Shortest distance from 0 to 0: 0
// Shortest distance from 0 to 1: 3
// Shortest distance from 0 to 2: 5
// Shortest distance from 0 to 3: 6
// Shortest distance from 0 to 4: 10
// Shortest distance from 0 to 5: 5
// Shortest distance from 0 to 6: 8

import java.util.*;
public class DijkstrasAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        List<List<Edge>> adj = new ArrayList<List<Edge>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Edge>());
        }
        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int d = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new Edge(d,w));
            adj.get(d).add(new Edge(u,w));
        }

        dijkstrasAlgo(adj,v,0);
        sc.close();
    }

    private static void dijkstrasAlgo(List<List<Edge>> adj, int v, int i) {
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[i] = 0;
        PriorityQueue<Pairs> pq = new PriorityQueue<Pairs>(v, new Pairs());
        pq.add(new Pairs(0,i));
        boolean[] visited = new boolean[v];
        while(!pq.isEmpty()){
            int vt = pq.poll().y;
            if(visited[vt])
                continue;
            else{
                visited[vt] = true;
                for(Edge el: adj.get(vt)){
                    if(dist[el.dest] > dist[vt] + el.wt){
                        dist[el.dest] = dist[vt] + el.wt;
                        pq.add(new Pairs(dist[vt]+el.wt, el.dest));
                    }
                }
            }

        }
        for(int j=0;j<v;j++){
            System.out.println("Shortest distance from "+i+" to "+j+": "+dist[j]);
        }

    }
}

class Edge{
    int wt;
    int dest;
    Edge(int dest, int wt){
        this.wt = wt;
        this.dest = dest;
    }
}

class Pairs implements Comparator<Pairs>{
    int x,y;
    Pairs(){}
    Pairs(int i, int j){
        x = i;
        y = j;
    }
    public int compare(Pairs a, Pairs b){
        return b.x - a.x;
    }
}
