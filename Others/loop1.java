package hello;
import java.util.*;

public class loop1 {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int q=sc.nextInt();
    	int sum;
    	for(int i=1;i<=q;i++) {
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		int n=sc.nextInt();
    		sum=a;
    		for(int j=0;j<n;j++) {
    			sum=sum+(int) (Math.pow(2,j)*b);
    			System.out.print(sum+" ");
    		}
    			
    		}
    	}

}
