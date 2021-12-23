// // Find The Dividing Number

// Asha has got a set of integers and he is thinking about what interesting 
// problem statement could be formed from these integers.And Eureka! She found one!

// The problem statement goes as follow:

// You have to find the maximum integer among the set of integers and divide the
// integer by 2. Since this is an integer division the result of division will
// be an integer. After division if the integer is greater than 0, then we put
// the updated integer again in the set of integers. Asha gives you m queries, each
// query q[i] means, that q[i]− 1 number of operations has already been performed
// and its time to perform q[i]th operation. Your task is to tell that for q[i]th
// operation which integer will get divided. 

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Integer arr[]= new Integer[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int chance[] = new int[1000001];
        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<n;i++)
            q1.add(arr[i]);
        int i=1;
        while(true)
        {
            int a=0,b=-1;
            if(!q1.isEmpty())
                a=q1.peek();
            if(!q2.isEmpty())
                b=q2.peek();
            if(a>=b && b!=0)
            {
                q1.remove();
                q2.add(a/2);
                chance[i++]=a;
            }
            else if(b>a && b!=0)
            {
                q2.remove();
                q2.add(b/2);
                chance[i++]=b;
            }
            else
                break;
        }
        for(int j=0;j<m;j++)
        {
            int q=sc.nextInt();
            int ans = chance[q];
            if(ans !=0)
                System.out.println(ans);
        }
    }
}