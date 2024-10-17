
package Array;
import java.util.*;
public class Al {

	public static void main(String[] args) {
////		ArrayList<String> list=new ArrayList<>();	
//	 	ArrayList list=new ArrayList<>();
//	   list.add("Akash");
//	   list.add("0.1545000");
//	   list.add("Ayush");
//	   list.add("Adarsh");
//	   list.add(2,"Ankit");
//	   System.out.println(list);
//	   System.out.println(list.size());
//	   list.remove(2);
//	   System.out.println(list);
//	   System.out.println(list.size());
//	   System.out.println(list.remove(2));
//	   System.out.println(list.get(1));
//	   System.out.println(list.remove(4));
		
		List<Integer> list=new ArrayList<>();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n = ");
     int n=sc.nextInt();
     for(int i=0;i<n;i++) {
      list.add(sc.nextInt());
     }
     for(int i=0;i<n;i++) {
         System.out.println(list.get(i)); 
     }

     }

}
