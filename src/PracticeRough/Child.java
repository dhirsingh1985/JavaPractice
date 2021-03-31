package PracticeRough;

public class Child extends Parent{

	Child()
	{
		super(1);
	}
	
	
	Child(String f, int...v)
	{
		super(1);
	}
	
	
	void method1(interfaceRules x)
	{
		x.method1();
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		//c.method1(x);
	}
}
