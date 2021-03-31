package PracticeRough;

class prep {
	void show() {
		System.out.println("A method");
	}
	void show2() {
		System.out.println("show2");
	}
}

class prep2 extends prep{
	void show() {
//		super.show();
		System.out.println("B method");
	}
	
	void show1() {
		System.out.println("show1");
	}
}

class prep3 extends prep2{
	void show() {
		System.out.println("c method");
	}
}
class test2{
	public static void main(String args[]) {
		prep p = new prep();
		prep2 p1= new prep2();
		prep3 p2 = new prep3();
		
		prep p3;
		
		p3 = p1;
		p3.show();
		
		p3=p2;
		p3.show();
		
		p3 =p;
		p3.show();
	}
}