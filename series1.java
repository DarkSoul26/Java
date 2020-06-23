package hello;
import java.util.Scanner;


public class series1 {
	public static void main(String[] args) {
		float sum=0;
		Scanner sc =new Scanner(System.in);
		float n= sc.nextFloat();
		for(float i=1;i<=n;i++)
		{
			sum=sum+(1/i);
			
		}
		System.out.println("the sum ="+sum);
		
	}

}
