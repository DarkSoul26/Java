package DynamicProgramming.LongestCommonSubsequence;
import java.util.*;

// Test cases:

// 4
// abcdef
// bxcrdlf
// aaaaa
// a
// a
// a
// abc
// xrt

// o/p
// 4
// 1
// 1
// 0

public class LCSRec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            String s1 = sc.next();
            String s2 = sc.next();
            int n = s1.length();
            int m = s2.length();
            System.out.println(lcs(s1,s2,n,m));
        }
        sc.close();
    }

    private static int lcs(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0)
            return 0;
        if(s1.charAt(n-1) == s2.charAt(m-1))
            return 1+lcs(s1,s2, n-1, m-1);
        else    
            return Math.max(lcs(s1,s2,n-1,m), lcs(s1,s2,n,m-1));
    }
}
