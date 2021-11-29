package hello;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc2 =new Scanner(System.in);
		int n=sc2.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0){
				System.out.println("the no. entered is not prime");
				break;
			}
		}
		System.out.println("the no. entered is prime");
	}

}
		

