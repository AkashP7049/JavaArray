package Array;

import java.util.Scanner;

public class ArrayIO {

	public static void main(String[] args) {
				
//		    int [] bday=new int[10];
//		    bday[1]=22;
//		    bday[6]=24;
//		    bday[4]=65;
//		    bday[9]=56;
//		    for (int i=0;i<10;i++) {
//		    	System.out.println(bday[i]);
		 //   }
//		    for(int ele:bday) {
//		    	System.out.println(ele);
//		    }
				
//				int [] bday= {10,2,55,47,69,45};
//				for(int i=0;i<bday.length;i++) {
//					System.out.println(bday[i]);
//				}
				
				
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter size of array :");
				int n=sc.nextInt();
				int [] arr=new int[n];
				System.out.println("Enter an element :");
				for(int i=0; i<n;i++) {

					arr[i]=sc.nextInt();
				}
//				int total=0;
//				for(int ele:arr) {
//					total+=ele;
//				}
//				System.out.println("Sum of an Array are :"+total);
				
				int max=arr[0];
				
			for(int i=0;i<n;i++) {
					if(arr[i]>max) {
						max=arr[i];
					}
			}
				System.out.println("The MAximum number of an array are :"+max);
			}

		}
		//Math.max(max,arr[i);
