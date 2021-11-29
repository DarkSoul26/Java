package hello;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int facto=1;
	    for(int i=n;i>=1;i--)
	    {
	    	facto=facto*i;
	    }
	    System.out.print(facto);
	    }
	}
