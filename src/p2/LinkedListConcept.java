package p2;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> l= new LinkedList<String>();
		
		l.add("Test");
		l.add("QTP");
		
		System.out.println(l);
		
		l.addFirst("Welcome to JAva");

		System.out.println(l);
		
		l.addLast("BBYE");
		
		System.out.println(l);
		System.out.println(l.get(0));
		
		l.set(0, "TOPPPPP");
		System.out.println(l);
	}

}
