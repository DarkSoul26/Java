package hello;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =0;
		int j=0;
		int sum=0;
		
		int a[]=new int[n];
		for(int k=0;k<n;k++) {
			a[k]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j>=i) {
				for(int y=i;y<=j;y++) {
					sum= sum+a[y];
					
					
				}
				if( sum<0 ) {
					count+=1;
				}
				
				
			}
			}
			
		}
		
	
	System.out.println(count);

}
}
