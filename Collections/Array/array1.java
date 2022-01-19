package hello;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. rows");
		int rows=sc.nextInt();
		System.out.println("enter no. coloumns");
		int cols=sc.nextInt();
		int a[][] = new int[rows][cols];
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println(""+a[1][1]);
	}
}