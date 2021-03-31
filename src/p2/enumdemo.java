package p2;


enum apple{
	mango,banana,rockmelon,watermelon
}

class autobox{
	static int m(Integer x) {
		return x;
	}
}
public class enumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		apple ap;
		ap = apple.banana;
		System.out.println(apple.banana);
		
		for(apple a :apple.values()) {
			System.out.println(a);
		}	
			Integer ob =100;		//Autobox to int
			int i =ob.byteValue();
			System.out.println(ob +" " +i);
		
			
			Integer ob1 = autobox.m(200);
			System.out.println(ob1);
			
			Character ch ='x';
			char ch1 = ch;
			System.out.println(ch);
		
			Boolean b1 = true;
			boolean b2  = b1;
			System.out.println(b2);
			
			
	}

}
