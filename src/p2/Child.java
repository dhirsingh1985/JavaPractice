package p2;

public class Child extends Parent{

	
	void method2()
	{
		if(this !=null)
		{
			System.out.println("CHILD HELLO");
		}
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.method2();
	}
}
