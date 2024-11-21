package HashTable;

import java.util.*;
public class HashMap1 {
      public static void main(String[] args) {
//		HashMap <String,Integer> m=new HashMap<>();
//		m.put("pranjal", 25);
//		m.put("vinayak", 12);
//		m.put("Akash", 28);
//		System.out.println(m);
    	  
    	  HashMap <Integer,Integer> m=new HashMap<>();
  		m.put(3, 25);
  		m.put(5, 12);
  		m.put(1, 28);
  		m.put(2, 54);
  		m.put(6, 64);
  		System.out.println(m);
  		System.out.println(m.size());
  		m.put(-1, 21);
  		System.out.println(m);
  		System.out.println(m.get(1));
  		System.out.println(m.get(10)); //null
  		System.out.println(m.containsKey(10)); //false
	    m.remove(2);
	    System.out.println(m);//remove key 2
	    System.out.println(m.remove(5));
	    System.out.println(m);
	    for(Map.Entry<Integer,Integer> e:m.entrySet()) {
	    	System.out.println(e.getKey() +" -> " +e.getValue());
	    }
      }
}
