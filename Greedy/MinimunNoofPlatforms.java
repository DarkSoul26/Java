// Test case:

// 2
// 6
// 800 840 1000 850 1400 1700
// 810 110 1020 1030 1000 1900
// 6
// 800 840 1000 850 1400 1700
// 810 110 1020 10230 1000 1900

// output:
// 2
// 3

import java.util.*;
public class MinimunNoofPlatforms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int dept[] = new int[n];
            for(int i=0;i<n;i++){
                // System.out.println("Enter arrival time and departure time for train: ");
                arr[i] = sc.nextInt();
                // dept[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                dept[i] = sc.nextInt();
            }
            System.out.println(minPlatforms(arr,dept,n));
        }
        sc.close();
    }

    private static int minPlatforms(int[] arr, int[] dept, int n) {
        Arrays.sort(arr);
        Arrays.sort(dept);
        int platforms = 1;
        int i = 0, j = 0, res = 0;
        while(i<n && j<n){
            if(arr[i] <= dept[j]){
                platforms+=1;
                i+=1;
            }
            else{
                platforms-=1;
                j+=1;
            }
            res = Math.max(res, platforms);
        }
        return platforms;
    }
}
