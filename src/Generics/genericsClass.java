package Generics;

public class genericsClass<T> {

	T obj;
	
	genericsClass(T obj)
	{
		this.obj=obj;
	}
	
	void showType()
	{
		System.out.println("Current object type is :" +obj.getClass().getName());
	}
	
}
