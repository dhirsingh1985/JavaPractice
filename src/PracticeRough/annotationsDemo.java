package PracticeRough;

import java.lang.reflect.Method;

@interface myAnno{
	String str();
	int val();
}

public class annotationsDemo {

	@myAnno(str = "Testing", val = 1000)
	static void MyMeth() throws NoSuchMethodException, SecurityException
	{
		annotationsDemo obj = new annotationsDemo();
		
		Class<?> c = annotationsDemo.class; //.getClass();
		
		Method m = c.getMethod("MyMeth");
		
		myAnno obj1 = m.getAnnotation(myAnno.class);
		
		System.out.println(obj1.str()+"   "+obj1.val());
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyMeth();
	}
}
