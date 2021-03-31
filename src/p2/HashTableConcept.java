package p2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// it is similar to hashmap but Synchronized 
		//no  null key, and no null values
		
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1,"Tom");
		h1.put(2,"Test");
		h1.put(3,"Java");
		h1.put(4,"Welcome");
	//create clone copy
		
		Hashtable h2 = new Hashtable();
		h2= (Hashtable) h1.clone();
		
		System.out.println(h1);
		System.out.println(h2);
		
		if (h1.containsValue("Tom"))
		{
			System.out.println("value found");
		}
		
		Enumeration e = h1.elements();
		System.out.println("***************");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Set s = h1.entrySet();
		System.out.println(s);
		
		
	}

}
