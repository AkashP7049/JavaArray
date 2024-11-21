package SubArray;
//
//public class SumSubArray {
//	public static void main(String[] args) {
//		int [] arr= {2,5,1,4,3};
//		int n=arr.length;
//		for(int i=0;i<n;i++) {
//			for(int j=i;j<n;j++) {
//				int count =0;
//				for(int k=i;k<=j;k++) {
//				
//					count +=arr[k];
//			
//			}
//			
//			System.out.println(count);
//		}
//		}
//	}
//}
//// time com :-O(n^3)

public class SumSubArray{
	public static void main(String[] args) {
		int arr []= {2,5,1,4,3};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum +=arr[j];
			 System.out.println(sum);
			}
		}
	}
}