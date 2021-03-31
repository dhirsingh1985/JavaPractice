package p2;

public class wrapperclass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		double b = Double.parseDouble(x);
		System.out.println(b);
		
		x= "true";
		Boolean c = Boolean.parseBoolean(x);
		System.out.println(c);
		
		//int to String
		
		int j =200;
		x =String.valueOf(j);
		System.out.println(x+20);
		
		String u ="100A";
		i = Integer.parseInt(u);
	}

}
