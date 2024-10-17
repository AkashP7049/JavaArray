package Array;

public class ReverseAinTwoPoi {
	
	
	public static void ReverseArray(int[] arr) {
	    int i=0;
		int j = arr.length-1;
	
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
		}
	}
	
	public static void main(String[] args) {
	 int [ ] Array= {1,2,3,4,5,6,7,8,9};
	ReverseArray(Array);
	 
	 for(int num: Array) {
		 System.out.println(num+" ");
	 }
	}

}
