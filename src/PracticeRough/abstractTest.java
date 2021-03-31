package PracticeRough;


public class abstractTest extends Demo1.abs1{

	void _getValue() {
		System.out.println("Child Class get Value method");
	}
	
	public static void main(String[] args) {
		abstractTest obj= new abstractTest();
		
		obj.method1();
		
	}
}
