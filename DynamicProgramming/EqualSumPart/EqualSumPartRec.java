package DynamicProgramming.EqualSumPart;
import java.util.*;

// Test case:
// 5 
// 4
// 2 6 14 6
// 4
// 2 6 12 6
// 3
// 1 2 3
// 5 6 9 1 3 5
// 5 
// 1 1 1 1 1

// o/p:
// true
// false
// true
// true
// false

public class EqualSumPartRec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
                sum+=a[i];
            }
            if(sum%2==0)
                System.out.println(equalSumPart(a, n, sum/2));
            else
                System.out.println("false");
        }
        sc.close();
    }

    private static boolean equalSumPart(int[] a, int n, int sum) {
        if(sum == 0)
            return true;
        if(n == 0)
            return false;
        if(a[n-1] > sum){
            return equalSumPart(a, n-1, sum);
        }
        else{
            return equalSumPart(a, n-1, sum-a[n-1]) || equalSumPart(a,n-1,sum);
        }
    }
}
