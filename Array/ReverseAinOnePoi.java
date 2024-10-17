package Array;

public class ReverseAinOnePoi {
	
	
	public static void ReverseArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
	}

	public static void main(String[] args) {
	 int [ ] Array= {1,2,3,4,5,6};
	 ReverseArray(Array);
	 
	 for(int num: Array) {
		 System.out.println(num+" ");
	 }
	}

}
