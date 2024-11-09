package Eucliden_GCD;

import java.util.Scanner;

public class GCD {

		public static void main(String[] args) {
//			int a=35;
//			int b=10;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
			for(int i=Math.min(a, b);i>=1;i--) {
				if(a%i==0 && b%i==0) {
					System.out.println("GCD of those number is :"+i);
					break;
				}
			}

	}

}
