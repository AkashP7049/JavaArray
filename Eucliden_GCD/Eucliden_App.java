package Eucliden_GCD;

import java.util.Scanner;

public class Eucliden_App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a,int b) {
		if(a==0) return b;
		
		return gcd(b%a ,a);
	}

}
// time com :-O(log min(a,b))