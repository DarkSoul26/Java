package Others;

// Test Cases:
// 2
// 4 12
// 2 6 14 6
// 4 81
// 2 6 12 6

// Op:
// true
// false

import java.util.*;
public class SubsetSumRec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++)
                a[i] = sc.nextInt();
            
            System.out.println(subsetSumRec(a, n, sum));
        }
        sc.close();
    }

    private static boolean subsetSumRec(int[] a, int n, int sum) {
        if(sum == 0)
            return true;
        if(n == 0)
            return false;
        if(a[n-1] > sum){
            return subsetSumRec(a, n-1, sum);
        }
        else{
            return subsetSumRec(a, n-1, sum-a[n-1]) || subsetSumRec(a,n-1,sum);
        }
    }
}
