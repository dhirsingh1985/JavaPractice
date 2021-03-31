package p2;

public class HSBC implements USBank,brazilbank {

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Credit method");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit method");
	}

	public void transfer() {
		System.out.println("hsbc transfer method");
	}

	@Override
	public void mutualFund() {
		// TODO Auto-generated method stub
		System.out.println("Mutual fund");
	}
	
	public static void test() {
		System.out.println("Test Method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}
