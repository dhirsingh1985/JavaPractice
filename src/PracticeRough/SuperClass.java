package PracticeRough;

public class SuperClass {

	private int pvtVariable=1;  // <-- NO ACCESS
	
	public int pubVariable=2;  //<--- Direct access
	
	private int pvtMethod()   // <-- NO ACCESS
	{
		return pvtVariable;
	}
	
	public int pubMethod()   //<--- Direct access
	{
		//return pvtVariable ;
		
		return pvtMethod();
	}
	
}
