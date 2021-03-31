package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Protection2 ob1 = new Protection2();
//		OtherPackage ob2 = new OtherPackage();
			int[]x = new int[4];
			x[0]= 10;
			x[1]=20;
			x[2]=30;
			x[3]=40;


			for(int j =0; j<x.length;j++) {
				System.out.println(x[j]);
				}
			Object[] ob = new Object[3];
			ob[0]= "Tom";
			ob[1]=12;
			ob[2]="1/1/2012";
			
			System.out.println(ob[2]);
			
			
			bmw b1 = new bmw();
			b1.test();
			b1.brakes();
			b1.stop();
			
			car c1 = new car();
			c1.test();
			c1.brakes();
			
			car c2 = new bmw();
			c2.test();
			
			HSBC h = new HSBC();
			h.credit();
			h.debit();
			h.transfer();
			
			USBank u= new HSBC();
			u.credit();
			u.debit();
			System.out.println(USBank.min_bal);
			h.mutualFund();
			
	}

}
