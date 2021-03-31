package p2;

public class callbyvaluecallbyref {

	int p,q;
	public static void main(String[] args) {
		callbyvaluecallbyref obj = new callbyvaluecallbyref();
		
		obj.p = 50;
		obj.q= 60;
		System.out.println("Before swapping " + obj.p+ "  " + obj.q);
		obj.swap(obj);
		System.out.println("After swapping " + obj.p+ "  " + obj.q);
	}
	
	public void swap(callbyvaluecallbyref t) {
		int temp;
		temp =t.p;	//50
		t.p=t.q;
		t.q= temp;
		
		
		
		
	}

}
