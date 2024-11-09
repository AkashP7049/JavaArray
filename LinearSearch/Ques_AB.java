package LinearSearch;
import java.util.*;
public class Ques_AB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		if(a>=2*b || b>=2*a) {
			System.out.println(0);
		}
		else {
			int min=Math.min(a, b);
			int max=Math.max(a, b);
			System.out.println(Math.min(2*min-max, min-max/2));
		}
	}

}
