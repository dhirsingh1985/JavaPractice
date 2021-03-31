package p2;

public class exceptionhandling {

	public static void main(String[] args) {
	try {
		demoproc();
	}
	catch(NullPointerException e) {
		System.out.println("Recaught exception");
	}
		
	}
	
		// TODO Auto-generated method stub
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e) {
		System.out.println("Caught inside demoproc");
		throw e;
		}
	}
		
		
	
}	


