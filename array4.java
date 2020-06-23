package hello;

import java.util.Scanner;

public class array4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] arr = null;
		while(a>0) {
			int m=a%2;
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = m;
			a=a/2;
		}
		for(int item: arr) {
			System.out.print(item+" ");
			}
	}
}

