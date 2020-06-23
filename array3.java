package hello;
import java.lang.reflect.Array;
import java.util.Scanner;
public class array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		int[] b = new int[a];
        for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
            
        }
		for (int j = a-1; j>=0; j--) { 
			  
            int x = (int)Array.get(b, j); 
            System.out.print(x + " "); 
        }
		}
	}

