package LinearSearch;
import java.util.*;
public class LinearSerach {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elemet :");
		int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i =0;i<n;i++) {
        	
        	arr[i] =sc.nextInt();
        }
         System.out.println("Enter your key = ");
         int key = sc.nextInt();
//        System.out.println(ls(arr,key));
         ls(arr ,key);
     

	}

//	public static boolean ls(int[] arr, int key) {
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i]==key)
//				return true;
//		}
//		return false;
//	}
// // output true and false
	
//	public static int ls(int[] arr, int key) {
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i]==key)
//				return i;
//		}
//		return -1;
//	}
//// output return first accurance
	  
//	public static int ls(int[] arr, int key) {
//		for (int i=arr.length-1;i>=0;i--) {
//			if(arr[i]==key)
//				return i;
//		}
//		return -1;
//	}
//	// output last to first search
	
//	public static void ls(int[] arr, int key) {
//		int f=-1,l=-1;
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i]==key) {
//				l=i;
//				if(f==-1) {
//					f=i;
//				}
//		}
//		
//		}
//		System.out.println(f+" "+l);
//	}
	
	public static void ls(int[] arr, int key) {
	int f=-Integer.MAX_VALUE,l=-1;
	for (int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
		
		f=Math.min(f, i);
		l=Math.max(l, i);
		}
	
	}
	if(f==Integer.MAX_VALUE) {
		System.out.println("-1  -1");
	}else {
		System.out.println(f+" "+l);
	}

}
}
