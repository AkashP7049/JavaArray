package Array;

import java.util.*;

public class InbuiltSort {

	public static void main(String[] args) {
//	   int arr[]= {54,65,9,11,7,2,3};
//        Arrays.sort(arr);
		Integer arr []= {54,65,9,11,7,2,3};
	   Arrays.sort(arr, Collections.reverseOrder());  
        for(int i:arr)
        System.out.println(i);
	}

}
