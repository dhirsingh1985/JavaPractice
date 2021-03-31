package p2;

import java.util.Hashtable;

public class HashTable {

	
	public void finalize() {
		System.out.println("finalize method");
	}
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B","Hello");
		
		h=null;
		System.out.println(h.size());
		
		h.put(1,100);
		h.put(2,200);
		System.out.println(h.size());
		
		for(int i =0; i<h.size();i++) {
			System.out.println(h.get(i));
		}
		
		System.out.println(h.get("B"));
	
	
	Hashtable<Integer,Integer> h1= new Hashtable<Integer, Integer>();
		 h1.put(1, 100);
		 h1.put(2, 200);
		 


	
	try {
		System.out.println("Inside try");
		int i =10/0;
		
	}
	catch(NullPointerException e) {
		System.out.println("Inside catch");
	}
	finally {
		System.out.println("Indise finally");
	}
	
	System.gc();
}
}