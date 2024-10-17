package Array;

public class ReversePart3 {
	
	
	public static void ReverseArray(int[] arr ,int i,int j) {
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
	 int i=0;
	 int k=3;
	 for(int j=k-1;j<Array.length;j+=k) {
			ReverseArray(Array , i, j);
			i+=k;
	 } 
	 for(int num: Array) {
		 System.out.println(num+" ");
	 }
	}

}
