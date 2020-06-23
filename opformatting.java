package hello;
import java.util.*;
public class opformatting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String a=sc.next();
		String s2=sc.next();
		String b=sc.next();
		String s3=sc.next();
		String c=sc.next();
		String n="0";
		String d=a;
		String e=b;
		String f=c;
		if(a.length()<=2) {
			 d=n+a;
		}
		System.out.println(s1+" "+d);
		if(b.length()<=2) {
			 e=n+b;
		}
		System.out.println(s2+" "+e);
		if(c.length()<=2) {
			 f=n+c;
		}
		System.out.println(s3+" "+f);
		

	}

}
