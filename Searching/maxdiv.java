// You are given two integers a and b. After that, you will be given q
// queries each of which contains two integers low and high. Let’s define
//  S as the set of common divisors of a and b which lie in the range low
//   to high i.e. low≤d≤high. Find the maximum element in this set S or
//    report−1 if no such element is possible.

import java.util.*;
import java.io.*;

public class Main {
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        else{
           return  gcd(b%a , a);
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if(a>b){
            long temp = a;
            a = b;
            b = temp;
        }
        int gcdresult= gcd((int) a,(int) b);
        long arr[] = new long[10001];
        for (int j= 1, i = 1; i*i <= gcdresult; i++,++j)
        { if (gcdresult % i == 0)
            { arr[j] = i;
                if(i*i!=gcdresult)
                    arr[++j] = gcdresult/i;
            }
        }
        Arrays.sort(arr);
        long t = sc.nextInt();
        while(t-->0){

            long maxCo =-1;
            long low = sc.nextInt();
            long high = sc.nextInt();
            for (int i = 0; i < arr.length; ++i)
            {
                if(arr[i]<=high&&arr[i]>=low)
                    maxCo=Math.max(maxCo,arr[i]);
            }
            System.out.println(maxCo);
        }
    }
}