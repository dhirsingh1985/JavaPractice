package p2;

public class TestBank {

	static Object obj ;
	public static <NullConcept> void main(String[] args) {
		// TODO Auto-generated method stub

		HSBC h1 = new HSBC();
		h1.show();
		
		
		System.out.println(obj);
	Integer i = null;
	Integer j=10;
	
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);
		
		String str = null;
		String str1 ="hello";
		
		System.out.println(str1 instanceof String);
		System.out.println(str instanceof String);
		
		TestBank obj1 = null;
		obj1.sum();
		
		String s1 = (String) null;
		System.out.println(s1);
//		bmw b1 = new bmw();
//		b1.test();
//		bmw.refuel();
//		car.refuel();
//		
		
//		
//		HSBC h1 = new HSBC();
//		h1.credit();
//		h1.debit();
//		h1.transfer();
//		
//		USBank u1= new HSBC();
//		u1.credit();
//		u1.debit();
//		h1.test();
//		USBank.test();
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}
	
	public void test() {
		System.out.println("Test metjhod");
	}

}
