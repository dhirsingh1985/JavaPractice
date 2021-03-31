package PracticeRough;

public interface rules{

	public void demo();
	default void demo1() {
		System.out.println("Default ");
	}
}
class testye extends Demo2 implements rules 
{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	
	public void demo1() {
		System.out.println("Overridden");
		
	}
	
}