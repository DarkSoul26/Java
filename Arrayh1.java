package hello;

import java.util.*;
import java.util.Scanner;
public class Arrayh1 {

public static void main(String[] args) {
    	        int[] arr = new int[5];
    	        int[] arr2 = new int[5];
    	        Scanner scanner=new Scanner(System.in);
    	        String[] arrItems = scanner.nextLine().split(" ");
    	        

    	        for (int i = 0; i < 5; i++) {
    	            int arrItem = Integer.parseInt(arrItems[i]);
    	            arr[i] = arrItem;
    	        }
    	        int a=arr[0]+arr[1]+arr[2]+arr[3];
    	        int b=arr[0]+arr[1]+arr[2]+arr[4];
    	        int c=arr[0]+arr[1]+arr[4]+arr[3];
    	        int d=arr[0]+arr[4]+arr[2]+arr[3];
    	        int e=arr[4]+arr[1]+arr[2]+arr[3];
    	        String[] arr1={a,b,c,d,e};
    	        for(int j=0;j<5;j++) 
    	        int arr1=Integer.parseInt(arr1[j]);
    	        arr2[j]=arr1;
    	        }
    	        Arrays.sort(arr1);
    	        System.out.print(arr1[0]+" "+arr1[4]);
}
}