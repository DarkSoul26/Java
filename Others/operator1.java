package hello;
import java.util.*;

public class operator1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double mealCost=sc.nextDouble();
		Double tipPercent=sc.nextDouble();
		Double taxPercent=sc.nextDouble();
		Double tip= mealCost*(tipPercent/100);
		Double tax= mealCost*(taxPercent/100);
		Double totalCost= (mealCost+tip+tax);
		int tt=(int) Math.round(totalCost);
		System.out.println(tt);
	}
}
