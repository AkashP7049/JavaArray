package Array;
import java.util.Scanner;
public class MaxThirdNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter an element :");
		for(int i=0; i<n;i++) {

			arr[i]=sc.nextInt();
		}
		 int firstMax = arr[0];
		 int secondMax = arr[0];
		 int thirdMax = arr[0];
         for (int num : arr) {
        if (num > firstMax) {
            thirdMax = secondMax;
            secondMax = firstMax;
            firstMax = num;
        }
        else if (num > secondMax && num < firstMax) {
            thirdMax = secondMax;
            secondMax = num;
        } 
        else if (num > thirdMax && num < secondMax) {
            thirdMax = num;
        }
    }
        System.out.println("Third Max number is :"+thirdMax);
	}

}
