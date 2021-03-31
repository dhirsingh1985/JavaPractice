package Package1;

public class genericClass<T> {
	T ob;
	
	genericClass(T o)
	{
		ob=o;
	}
	
	T getOb()
	{
		return ob;
	}
	
	void showtype()
	{
		System.out.println("Value of T is "+ob.getClass().getName());
	}
}
