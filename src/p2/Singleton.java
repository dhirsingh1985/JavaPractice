package p2;

public class Singleton {

	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str ="Hey , I am  using singleton class";
		
	}
	
	public static Singleton getInstance() {
		if(singleton_instance== null)
			singleton_instance= new Singleton();
		return singleton_instance;
	}
	
	
	
	public static void main(String[] args) {
		// That can have only and one object
		//Make constructor as private
		//Write a static method that has return type object this singlteon class-- Lazy intialization
		
		Singleton x = Singleton.getInstance();
		x.str= (x.str).toUpperCase();
		System.out.println(x.str);
	}

}
