package p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// contains unique elements
		//stores values in Key value pair
		//it may have one null key and multiple null values
		//it maintains no order
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Selenium");
		hm.put(2, "TestEmplete");
		hm.put(3,"QTP");
		
		System.out.println(hm.get(2));
		
		for(Entry<Integer, String> m: hm.entrySet()) {
			System.out.println(m.getKey()+" " +m.getValue());
		}
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Jyoti", 29);
		Employee e2 = new Employee("Hello", 30);
		Employee e3 = new Employee("world", 10);
		Employee e4 = new Employee("Groi", 45);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		
		for(Entry<Integer, Employee> m : emp.entrySet())
		{
			int key =m.getKey();
			Employee e = m.getValue();
			System.out.println(key +"   Info");
			
			System.out.println(e.name + " " +e.age);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
