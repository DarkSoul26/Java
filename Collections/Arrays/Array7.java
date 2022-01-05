package hello;
import java.util.Scanner;
import java.util.Arrays;
public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
			
		}
		System.out.println("");
		for(int k=n-2;k>=0;k--) {
			if(a[k]==a[n-1]) {
				
			}
			else if (a[k]<a[n-1]){
				System.out.println(a[k]);
				break;
			}
		}
	}
}
