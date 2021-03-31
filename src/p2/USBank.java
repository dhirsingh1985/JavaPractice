package p2;

public interface USBank {

	int min_bal =1000;
	public void credit();
	public void debit();
	public static void test() {
		System.out.println("Interface test method");
	}
	
	public void display();
	default void show() {
		System.out.println("show mwrhod");
	}
}
