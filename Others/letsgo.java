package hello;
import java.util.*;
import java.lang.*;
import java.io.*;
public class letsgo {
	public static void main(String[] args) {
//		
//		int a[][]= {{1,2,3},
//				{2,44,56}};
//		System.out.println(a[1][1]);
//		int a = 1, b = 2, c = 3, d = 4, e;
//		  e = c + d = b * a;
//		  System.out.println(e);
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int sum=0,sum1=0;
		    int x=0;
		    
		    for(int i=1;i<=n;i++){
		        
		        for(int j=1;j<=m;j++){
		                if((n*m)%(i*j)==0){
		                    x=(n*m)/(i*j);
		                
		                    sum=sum+x;
		                }
		        }
		        sum1=sum1+sum;
		        sum=0;
		        x=0;
		    }
		    System.out.println(sum1);
		}
	}
}
