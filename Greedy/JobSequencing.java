// Sample test:

// 9
// 1 7 15
// 2 2 20
// 3 5 30
// 4 3 18
// 5 4 18
// 6 5 10
// 7 2 23 
// 8 7 16
// 9 3 25

import java.util.*;

public class JobSequencing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id,d,p;
        Job[] jobs = new Job[n];
        for(int i=0;i<n;i++){
            id = sc.nextInt();
            d = sc.nextInt();
            p = sc.nextInt();
            jobs[i] = new Job(id,d,p);
        }
        jobSequencing(jobs,n);
        sc.close();
    }

    private static void jobSequencing(Job[] jobs, int n){
        Arrays.sort(jobs, new Comparator<Job>() {
            public int compare(Job a, Job b){
                return b.p - a.p;
            }
        });
        int results[] = new int[n];
        boolean slot[] = new boolean[n];
        int totalProf = 0;
        for(int i=0;i<n;i++){
            for(int j = Math.min(n-1,jobs[i].d)-1;j>=0;j--){
                if(!slot[j]){
                    slot[j] = true;
                    results[j] = i;
                    totalProf+=jobs[i].p;
                    break;
                }
            }
        }
        System.out.println(totalProf);
    }
}

class Job{
    int id;
    int d;
    int p;
    Job(int id, int d, int p){
        this.id = id;
        this.d = d;
        this.p = p;
    }
}
