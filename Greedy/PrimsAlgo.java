// Test Case:

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
public class PrimsAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();
        int[][] graph = new int[v][v];
        for(int i = 0; i < e; i++){
            System.out.print("Enter the edge: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int wt = sc.nextInt();
            graph[a][b] = wt;
            graph[b][a] = wt;
        }
        primsAlgo(graph, v);
        sc.close();
    }

    private static void primsAlgo(int[][] graph, int v) {
        int result[] = new int[v];
        Arrays.fill(result, -1);
        boolean mst[] = new boolean[v];
        int minWt[] = new int[v];
        Arrays.fill(minWt, Integer.MAX_VALUE);
        for(int i=0;i<v-1;i++){
            int minV = minWeight(minWt, mst);
            mst[minV] = true;
            for(int j=0;j<v;j++){
                if(graph[minV][j] != 0 && mst[j] == false && graph[minV][j] < minWt[j]){
                    minWt[j] = graph[minV][j];
                    result[j] = minV;
                }
            }
        }
        System.out.println("The minimum spanning tree is: ");
        for(int i=1;i<v;i++){
            System.out.println(result[i]+" to "+i+" with weight: "+graph[i][result[i]]);
        }
    }

    private static int minWeight(int[] minWt, boolean[] mst) {
        int resInd = -1;
        for(int i=0;i<minWt.length;i++){
            if(!mst[i] && (resInd==-1 || minWt[i]<minWt[resInd])){
                resInd = i;
            }
        }
        return resInd;
    }
}
