package Package1;

public interface interfaceDemo {

	void method1();
	void method2();
	void method3();
	
	default void defaultMethod1() {
		System.out.println("default 1");
	}
	
	default void defaultMethod2() {
		System.out.println("default 1");
	}
	
	static void statMethod()
	{
		System.out.println("Static method of interface");
	}
}
