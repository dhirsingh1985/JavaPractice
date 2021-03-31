package PracticeRough;

public class SamePackage extends callback{
	SamePackage(){
		protection p = new protection();
		System.out.println("same package constructor");
		System.out.println("n = " + p.n);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}

	
	 public void callback() { // TODO Auto-generated method stub int x
		  
	  System.out.println("Call back method");
	 
		
	}
	
	public static void main(String args[]) {
		SamePackage p1 = new SamePackage();
		callback obj = new SamePackage();
		
		p1.callback();
		
		
		
		
	}
	
	
	
	class fr{
		void x(){
		SamePackage p1 = new SamePackage();
		p1.test();
	}

	}
}
