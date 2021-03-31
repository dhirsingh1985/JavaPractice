package p2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("Welcome");
		
		System.out.println(a1.get(2));
		
		System.out.println(a1.size());
	
		for(int i =0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("jyoti");
		
		Employee e1= new Employee("Jyoti", 32);
		Employee e2= new Employee("welcome", 20);
		Employee e3= new Employee("hello", 10);
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee>it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name + " " +emp.age);
		}
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("welcome");
		a3.add("Hello world");
		a3.add("jyoti");
		
		a3.addAll(a2);
		
		for(int i =0; i<a3.size();i++) {
			System.out.println(a3.get(i));
		}
		System.out.println("******************************");
		a3.removeAll(a2);
		for(int i =0; i<a3.size();i++) {
			System.out.println(a3.get(i));
		}
		
		System.out.println("******************************");
		
		a3.retainAll(a2);
		for(int i =0; i<a3.size();i++) {
			System.out.println(a3.get(i));
		}	
		
		
		
		
		
		

	}

}
