package HashTable;

import java.util.Scanner;

public class Hashing {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array :");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter an element :");
		for(int i=0; i<n;i++) {

			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++) {
			max=Math.max(max,arr[i]);
		}
		// System.out.println(max);  ////print max
		int hash[] =new int [max+1];  // create hash table
		for(int x:arr) {
			hash[x]++;
		}
		int maxFreq=Integer.MIN_VALUE, minFreq=Integer.MAX_VALUE;
		int maxEle=Integer.MIN_VALUE,minEle=Integer.MAX_VALUE;
		for(int i=0;i<hash.length;i++) {
			if(hash[i]!= 0 && hash[i]>maxFreq) {
				maxFreq=hash[i];
				maxEle=i;
			}
			if(hash[i]!=0 && hash[i]<minFreq) {
				minFreq=hash[i];
				minEle=i;
			}
		}
		System.out.println(" Maximun frequency :"+maxEle+" "+maxFreq);
		System.out.println("Minmun Frequency :"+minEle+" "+minFreq);

	}

}
