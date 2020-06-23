package hello;
import java.lang.reflect.Array;
import java.util.*;
public class left_rot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=n-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=n-1;j>=1;j--) {
			int m=a[j];
			a[j]=a[j-1];
			a[j-1]=m;
		}
		for (int z =0; z<=n-1; z++) { 
			  
            int x = (int)Array.get(a, z); 
            System.out.print(x + " "); 
        }
		
}
}
