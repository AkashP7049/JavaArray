package Array;

import java.util.Scanner;

public class MaxSecondNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter an element :");
		for(int i=0; i<n;i++) {

			arr[i]=sc.nextInt();
		}
     int max = arr[0];
     int secondMax = arr[0];

  for (int num : arr) {
    if (num > max) {
        secondMax = max;
        max = num;
    } else if (num > secondMax && num != max) {
        secondMax = num;
   
    }
}
 
    System.out.println("Second Max number is :"+secondMax);

	}

}
