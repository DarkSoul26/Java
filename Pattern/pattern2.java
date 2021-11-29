package hello;
import java.util.Scanner;
public class pattern2 {
	public static void main(String[] args ) {
		
			
		int x=1;
		for(int i=1;i<=4;i++) {
			System.out.println("");
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				 
					System.out.print(x+" ");
					x++;
				
				
			}
		}
	}
	
}
