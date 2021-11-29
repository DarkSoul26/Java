package hello;
import java.util.*;

public class string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			String a=sc.nextLine();
			for(int j=0;j<=a.length();j+=2) {
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
			for(int z=1;z<=a.length();z+=2) {
				System.out.print(a.charAt(z));
			}
		}
		
	}
}
