package hello;

import java.util.*;

public class palidromee {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int x=A.length();
        Boolean t;
        for(int i=0;i<x;i++){
            if(A.charAt(i)==A.charAt(x-i-1)) {

            }else{
            	System.out.println("No");
        
            	return;
            }
            
            		
            

        }System.out.println("Yes");
        
    }

}
