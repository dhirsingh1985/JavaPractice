package p2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		ar.add("Jyoti");
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);

	}

}
