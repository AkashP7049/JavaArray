package SubArray;

public class SubArray {
	public static void main(String[] args) {
		int [] arr= {25,5,20,4,18};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int count =0;
				for(int k=i;k<=j;k++) {
				
					count +=arr[k];
			
			}
			
			System.out.println(count);
		}
		}
	}

}
