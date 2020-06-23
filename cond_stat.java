package hello;
import java.util.*;
public class cond_stat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0) {
			if (1<n && n<6) {
				System.out.println("Not Weird");
			}
			else if(5<n && n<21) {
				System.out.println("Weird");
			}
			else if(n>20) {
				System.out.println("Not Weird");
			}
		}
		else {
				System.out.println("Weird");
			}
		}


}
