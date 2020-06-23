package hello;
import java.util.Scanner;


public class pattern1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("");
			for(int x=1;x<=i;x++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
				
			}
			
		}
	}

}
