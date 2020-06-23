package hello;
import java.util.Scanner;
public class pattern3 {
	public static void main(String[] args ) {
		int i;
		for(i=1;i<=4;i++) {
			System.out.println("");
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		}
		for(i=4;i<=7;i++) {
			System.out.println("");
			for(int x=3;x>=i-3;x--) {
				System.out.print("* ");
			}
		}
	}
}
